public class CreditPaymentService {
    public double calculate(double percent, int sumCredit, int timeCredit) {
        percent = percent / 12;
        double time = timeCredit * 12;
        double costMonth = sumCredit * ((percent * Math.pow(1 + percent, time)) / (Math.pow(1 + percent, time) - 1));
        return costMonth;
    }
}
