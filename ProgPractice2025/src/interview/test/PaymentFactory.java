package interview.test;

public class PaymentFactory {

    public static Payment getPaymentFactory(String paymentType) {
        // according to type will return paytype
        if(paymentType.equals("PAYPAL")) {
            // return object of Paypal
        } else if(paymentType.equals("CREDIT_CARD")) {
            // return object of CREDIT_CARD
        } else if (paymentType.equals("UPI")) {
            // return object of UPI

        }
        return null;
    }
}
