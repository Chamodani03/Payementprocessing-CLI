import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentFactory factory = new PaymentFactory();
        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("=== Payment Processing System ===");
        System.out.print("Enter payment method (credit/paypal): ");
        String method = scanner.next();

        Payment payment = factory.createPayment(method);

        if (payment == null) {
            System.out.println("Invalid payment method.");
            scanner.close();
            return;
        }

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        Command payCommand = new PayCommand(payment, amount);
        processor.setCommand(payCommand);
        processor.processPayment();

        System.out.println("Success!");
        scanner.close();
    }
}