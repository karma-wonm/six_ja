public class Main {
    public static void main(String[] args) {
        double percent = 0.0999;
        int sumCredit = 1_000_000;
        CreditPaymentService service = new CreditPaymentService();
        int costOne = (int) service.calculate(percent, sumCredit, 1);
        System.out.println(costOne);
        int costTwo = (int) service.calculate(percent, sumCredit, 2);
        System.out.println(costTwo);
        int costThree = (int) service.calculate(percent, sumCredit, 3);
        System.out.println(costThree);
    }
}