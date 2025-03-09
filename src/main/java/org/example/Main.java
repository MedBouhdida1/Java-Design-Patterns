package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Appliance> appliances = Arrays.asList(
                ApplianceFactory.createAppliance(ApplianceFactory.ApplianceType.REFRIGERATOR, "BrandB", 600),
                ApplianceFactory.createAppliance(ApplianceFactory.ApplianceType.DISHWASHER, "BrandC", 450),
                ApplianceFactory.createAppliance(ApplianceFactory.ApplianceType.WASHING_MACHINE, "BrandD", 700)
        );
        List<Appliance> ecoModeAppliances = appliances.stream()
                .filter(Appliance::isEcoMode)
                .toList();

        List<Appliance> sortedEcoModeAppliances = ecoModeAppliances.stream()
                .sorted(Comparator.comparingDouble(Appliance::getEnergyConsumption))
                .toList();



        DiscountFunction discountFunction = (originalPrice, discountRate) -> originalPrice * (1 - discountRate);

        sortedEcoModeAppliances.forEach(appliance -> {
            double discountedEnergyConsumption = discountFunction.applyDiscount(appliance.getEnergyConsumption(), appliance.getDiscount());
            System.out.println("Discounted Energy Consumption for " + appliance.getModel() + ": " + discountedEnergyConsumption + " kWh");
        });

        ConsumptionStrategy normalStrategy = new NormalModeStrategy();
        ConsumptionStrategy ecoStrategy = new EcoModeStrategy();

        sortedEcoModeAppliances.forEach(appliance -> {
            double normalConsumption = normalStrategy.calculateAnnualConsumption(appliance.getEnergyConsumption());
            double ecoConsumption = ecoStrategy.calculateAnnualConsumption(appliance.getEnergyConsumption());
            System.out.println("Annual Consumption (Normal) for " + appliance.getModel() + ": " + normalConsumption + " kWh");
            System.out.println("Annual Consumption (Eco) for " + appliance.getModel() + ": " + ecoConsumption + " kWh");
        });
    }
}