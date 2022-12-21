public class Check extends Payment {
    private String checkNumber;

    public Check(double amount, String checkNumber) {
        super(amount);
        this.checkNumber = checkNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    @Override
    public String getPaymentType() {
        return "Check";
    }
}