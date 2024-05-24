package day23_oop.odev;

import java.util.Scanner;

public class Daire1 extends Kat implements KisiBilgisi,DaireBilgisi,KapiBilgisi{
    @Override
    public void kacinciKat() {
        System.out.println("Bu Daire zemin katta bulunuyor");
    }

    @Override
    public void daireNo() {
        System.out.println("Daire No : 1");
    }

    @Override
    public void kapiTuru() {
        System.out.println("Celik kapi");
    }

    @Override
    public void zilSesi() {
        System.out.println("Kus sesi");
    }

    @Override
    public void isim() {
        System.out.println("Ali");
    }

    @Override
    public void soyisim() {
        System.out.println("Can");
    }

    @Override
    public void yas() {
        System.out.println("34");
    }

   /* @Override
    public void lambaYaniyorMu() {
        System.out.println("Evet lambasi geceleri yaniyor");
    }*/
}
