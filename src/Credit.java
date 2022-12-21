public class Credit extends Payment {
    private String cardNumber;
    private String expiryDate;
    private String cardType;

    public Credit(double amount, String cardType, String cardNumber, String expiryDate) {
        super(amount);
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCardType() {
        return cardType;
    }

    @Override
    public String getPaymentType() {
        return "Credit";
    }
}