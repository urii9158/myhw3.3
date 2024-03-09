public class CreditPaymentService {
    public int calculate(int periodInYears, double interestRate, int amountOfCredit) {
        double monthlyInterestRate = interestRate / (12 * 100);
        int numberOfPayments = periodInYears * 12;
        double monthlyPayment = (monthlyInterestRate * amountOfCredit) / (1 - Math.pow((1 + interestRate), -numberOfPayments));
        return (int) monthlyPayment;
    }
}