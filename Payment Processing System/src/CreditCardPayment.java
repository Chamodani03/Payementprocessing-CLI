public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " processed using Credit Card.");
    }
}