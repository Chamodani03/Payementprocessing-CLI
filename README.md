# Payment Processing System (Java)

A simple console-based **Payment Processing System** built with Java to demonstrate Object-Oriented Programming (OOP) principles and Design Patterns.

## 🚀 Features
- Support for multiple payment methods: **Credit Card** and **PayPal**.
- Flexible architecture using **Factory Method** and **Command** design patterns.
- Clean and modular code structure.

## 🛠️ Design Patterns Used
1. **Factory Method Pattern**: Used in `PaymentFactory.java` to create payment objects dynamically based on user input.
2. **Command Pattern**: Used to encapsulate payment requests as objects, allowing for flexible execution through the `PaymentProcessor`.

## 📁 Project Structure
The project consists of the following files:
* `Payment.java` - Interface for payment methods.
* `CreditCardPayment.java` - Concrete implementation for Credit Cards.
* `PayPalPayment.java` - Concrete implementation for PayPal.
* `PaymentFactory.java` - Creator class for payment objects.
* `Command.java` - Interface for the command pattern.
* `PayCommand.java` - Concrete command class.
* `PaymentProcessor.java` - Invoker class that executes commands.
* `PaymentApp.java` - Main entry point of the application.

## 💻 How to Run

### Prerequisites
- **JDK 17** or higher installed.
- **VS Code** with **Extension Pack for Java** installed.

### Steps
1. Clone or download this repository.
2. Open the project folder in VS Code.
3. Open the terminal (**Ctrl + `**).
4. Compile the Java files:
   ```bash
   javac *.java
