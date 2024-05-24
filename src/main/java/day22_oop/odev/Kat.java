package day22_oop.odev;

public abstract class Kat extends Apartman{

    @Override
    public void apartmanBilgisi() {
        System.out.println("Kat bilgisi");
    }
    public abstract void kacinciKat();
}
