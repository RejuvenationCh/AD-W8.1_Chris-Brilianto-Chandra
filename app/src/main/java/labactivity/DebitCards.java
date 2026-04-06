package labactivity;

public class DebitCards implements IIdentifiable {
    private String holderName;
    private String cardNumber;

    public DebitCards(String owner, String number) {
        this.holderName = owner;
        this.cardNumber = number;
    }

    @Override
   public String getUniqueIdentifier() {
        if (cardNumber != null && cardNumber.length() >= 4) {
            return "CARD-****" + cardNumber.substring(cardNumber.length() - 4);
        }
        return "CARD-INVALID";
    }
}
    
