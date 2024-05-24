package day22_oop.odev;

public class Daire4 extends Kat implements DaireSahibi,Oda {
    private String wifi="Wifi parola : 000000000";

    @Override
    public void kacinciKat() {
        System.out.println("Bu daire ikinci kat'ta.");
    }

    @Override
    public void isim() {
        System.out.println("Melek");
    }

    @Override
    public void soyisim() {
        System.out.println("Gungor");
    }

    @Override
    public void yas() {
        System.out.println("Yas 27");
    }

    @Override
    public void odaSayisi() {
        System.out.println("Bu daire 3 odali.");
    }

    public String getWifi() {
        return wifi;
    }
}
