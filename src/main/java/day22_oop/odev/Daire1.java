package day22_oop.odev;

public class Daire1 extends Kat implements DaireSahibi, Oda {

    private String wifi = "Wifi parola : 1234567890";

    @Override
    public void kacinciKat() {
        System.out.println("Bu daire birinci kat'ta.");
    }

    @Override
    public void isim() {
        System.out.println("Umut");
    }

    @Override
    public void soyisim() {
        System.out.println("Altinbas");
    }

    @Override
    public void yas() {
        System.out.println("Yas 32");
    }

    @Override
    public void odaSayisi() {
        System.out.println("Bu daire 5 odali.");
    }

    public String getWifi() {
        return wifi;
    }
}
