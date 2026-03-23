public class PaymentFactory {
    public Payment createPayment(String type) {
        if (type == null) return null;
        
        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        }
        return null;
    }
}