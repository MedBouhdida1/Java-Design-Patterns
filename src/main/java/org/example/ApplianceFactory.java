package org.example;

public class ApplianceFactory {

    public enum ApplianceType {
        WASHING_MACHINE, REFRIGERATOR, DISHWASHER
    }

    public static Appliance createAppliance(ApplianceType type, String brand, double energyConsumption) {
        switch (type) {
            case WASHING_MACHINE:
                return new Appliance.Builder()
                        .setModel("WM-123")
                        .setBrand(brand)
                        .setEnergyConsumption(energyConsumption)
                        .setEcoMode(true)
                        .setDiscount(0.05)
                        .build();
            case REFRIGERATOR:
                return new Appliance.Builder()
                        .setModel("RF-456")
                        .setBrand(brand)
                        .setEnergyConsumption(energyConsumption)
                        .setEcoMode(false)
                        .setDiscount(0)
                        .build();
            case DISHWASHER:
                return new Appliance.Builder()
                        .setModel("DW-789")
                        .setBrand(brand)
                        .setEnergyConsumption(energyConsumption)
                        .setEcoMode(true)
                        .setDiscount(0.07)
                        .build();
            default:
                throw new IllegalArgumentException("Unknown appliance type");
        }
    }
}

