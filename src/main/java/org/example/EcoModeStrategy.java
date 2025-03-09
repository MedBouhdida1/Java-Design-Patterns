package org.example;

public class EcoModeStrategy implements ConsumptionStrategy {
    public double calculateAnnualConsumption(double dailyConsumption) {
        return dailyConsumption * 365 * 0.8;
    }
}
