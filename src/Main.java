public class Main {
    public static void main(String[] args) {
       CreditPaymentService service = new CreditPaymentService();
       int creditTerm = 36;
       int creditSum = 1_000_000;
       double creditRate = 9.99;
       int creditPayment = service.calculate(creditSum, creditTerm, creditRate);
       System.out.println(creditPayment);

    }
}