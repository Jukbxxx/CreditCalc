public class CreditPaymentService {
    public int calculate(int amount, int term, double rate) {
        double monthlyRate = rate / 12 / 100; // Переменная для хранения месячной процентной ставки
        double montlyRateInDegree = Math.pow((monthlyRate + 1), term); // Месячную процентную ставку возводим в степень

        // Формула расчета аннуитетного платежа по кредиту:
        int result = (int) ((int) amount * monthlyRate * montlyRateInDegree / (montlyRateInDegree - 1));
        return result;
    }
}
