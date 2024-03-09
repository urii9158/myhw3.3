public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000;
        int periodInYears = 1;
        double interestRate = 9.99;

        double monthlyPayment = service.calculate(periodInYears, interestRate, amountOfCredit);
        System.out.println(monthlyPayment);
    }
}
