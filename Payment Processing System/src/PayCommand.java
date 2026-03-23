public class PayCommand implements Command {
    private Payment payment;
    private double amount;

    public PayCommand(Payment payment, double amount) {
        this.payment = payment;
        this.amount = amount;
    }

    @Override
    public void execute() {
        payment.pay(amount);
    }
}