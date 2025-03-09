package org.example;

public class Appliance {
    private String model;
    private String brand;
    private double energyConsumption;
    private boolean isEcoMode;
    private double discount;

    public Appliance(Builder builder) {
        this.model = builder.model;
        this.brand = builder.brand;
        this.energyConsumption = builder.energyConsumption;
        this.isEcoMode = builder.isEcoMode;
        this.discount = builder.discount;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public boolean isEcoMode() {
        return isEcoMode;
    }

    public double getDiscount() {
        return discount;
    }

    // Builder class
    public static class Builder {
        private String model;
        private String brand;
        private double energyConsumption;
        private boolean isEcoMode;
        private double discount;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setEnergyConsumption(double energyConsumption) {
            this.energyConsumption = energyConsumption;
            return this;
        }

        public Builder setEcoMode(boolean isEcoMode) {
            this.isEcoMode = isEcoMode;
            return this;
        }

        public Builder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Appliance build() {
            return new Appliance(this);
        }
    }
}
