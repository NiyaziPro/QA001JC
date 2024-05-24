package day23_oop.konu;

public class Telefon extends Teknoloji{
    @Override
    public void cipSAyisi() {
        System.out.println("Telefon cip sayisi 150");
    }

    public String cip = "Telefonda cip yok ";
    public void kameraSayisi(){
        System.out.println("Telefonda kamera sayisi : 2");
    }
}
