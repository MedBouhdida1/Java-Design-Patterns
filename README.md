# EnergyEfficientApplianceManager

## Overview
EnergyEfficientApplianceManager is a Java-based project that demonstrates the use of multiple design patterns to efficiently manage and optimize the energy consumption of household appliances. The primary objective is to showcase how design patterns can be utilized to solve real-world problems, such as energy efficiency management.

## Design Patterns Implemented

### Factory Pattern
The Factory Pattern is used to create different types of appliances dynamically. This enhances flexibility, allowing new appliance types to be introduced without modifying existing code.

### Builder Pattern
The Builder Pattern is employed to construct `Appliance` objects step by step. This pattern is beneficial when creating complex objects with multiple optional attributes.

### Strategy Pattern
The Strategy Pattern defines multiple algorithms for calculating annual energy consumption in different modes (e.g., normal mode, eco mode). This allows the selection of a suitable algorithm at runtime without modifying the client code.

- **NormalModeStrategy**: Calculates annual consumption assuming standard daily usage.
- **EcoModeStrategy**: Calculates annual consumption with a reduction in daily usage.

### Functional Interface
A functional interface is utilized to apply dynamic discounts based on energy consumption. This approach leverages Java's functional programming capabilities to create a reusable and flexible discounting mechanism.

## Project Structure

- **Appliance Class**: Represents an appliance with attributes like model, brand, energy consumption, eco mode status, and discount rate.
- **ApplianceFactory**: Implements the Factory Pattern to instantiate appliances using the Builder Pattern.
- **ConsumptionStrategy**: Defines an interface for different strategies to calculate annual energy consumption.
- **NormalModeStrategy**: Implements the strategy for normal mode consumption.
- **EcoModeStrategy**: Implements the strategy for eco mode consumption.
- **DiscountFunction**: A functional interface that applies discounts dynamically.
- **Main Class**: Demonstrates appliance creation, filtering, sorting, discount application, and consumption calculation.

## How to Run

### Clone the Repository:
```sh
git clone https://github.com/yourusername/EnergyEfficientApplianceManager.git
```

### Navigate to the Project Directory:
```sh
cd EnergyEfficientApplianceManager
```

### Compile and Run the Project:
Use a Java IDE such as IntelliJ IDEA, Eclipse, or VS Code, or use a build tool like Maven or Gradle to compile and execute the project.

## Requirements
- Java 8 or later
- Maven/Gradle (optional but recommended)
- A Java IDE for ease of execution

## Contributing
Feel free to fork the repository and submit pull requests for improvements or additional features.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

