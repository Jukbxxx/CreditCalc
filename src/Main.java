public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int firstCreditTerm = 12;
        int creditSum = 1_000_000;
        double creditRate = 9.99;
        int firstCreditPayment = service.calculate(creditSum, firstCreditTerm, creditRate);
        System.out.println("Сумма ежемесячного платежа сроком на 1 год: " + firstCreditPayment);

        System.out.println();

        int secondCreditTerm = 24;
        int secondCreditPayment = service.calculate(creditSum, secondCreditTerm, creditRate);
        System.out.println("Сумма ежемесячного платежа сроком на 2 года: " + secondCreditPayment);

        System.out.println();

        int thirdCreditTerm = 36;
        int thirdCreditPayment = service.calculate(creditSum, thirdCreditTerm, creditRate);
        System.out.println("Сумма ежемесячного платежа сроком на 3 года: " + thirdCreditPayment);


    }
}