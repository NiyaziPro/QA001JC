package day25_collections.ornek;

public class Bankamatik {
    String cardName;
    int pin;
    boolean isValid;

    public Bankamatik(String cardName, int pin, boolean isValid) {
        this.cardName = cardName;
        this.pin = pin;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Bankamatik{" +
                "cardName='" + cardName + '\'' +
                ", pin=" + pin +
                ", isValid=" + isValid +
                '}';
    }
}
