public class PaymentProcessor {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void processPayment() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}