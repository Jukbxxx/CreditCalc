public class CreditPaymentService {
    public int calculate (int amount, int term, double rate) {
        double monthlyRate = rate / 12 / 100;
        double montlyRateInDegree = Math.pow((monthlyRate + 1), term);
        int result = (int) ((int) amount * monthlyRate * montlyRateInDegree / (montlyRateInDegree - 1));
        return result;
    }
}
