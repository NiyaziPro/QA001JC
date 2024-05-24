package day22_oop.odev;

public class Daire7 extends Kat implements DaireSahibi,Oda{
    @Override
    public void kacinciKat() {
        System.out.println("Bu daire ucuncu kat'ta.");
    }

    @Override
    public void isim() {
        System.out.println("Bu apartman bos!");
    }

    @Override
    public void soyisim() {

    }

    @Override
    public void yas() {

    }

    @Override
    public void odaSayisi() {
        System.out.println("Bu daire 4 odali.");
    }
}
