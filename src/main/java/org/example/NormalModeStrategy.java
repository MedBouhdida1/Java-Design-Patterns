package org.example;

public class NormalModeStrategy implements ConsumptionStrategy {
    public double calculateAnnualConsumption(double dailyConsumption) {
        return dailyConsumption * 365;
    }
}
