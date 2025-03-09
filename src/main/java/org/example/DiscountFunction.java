package org.example;

@FunctionalInterface
public interface DiscountFunction {
    double applyDiscount(double originalPrice, double discountRate);
}
