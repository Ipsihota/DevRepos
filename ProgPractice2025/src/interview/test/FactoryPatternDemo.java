package interview.test;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentFactory("UPI");
        payment.showInfo();
    }
}


