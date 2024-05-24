package day23_oop.odev;

import java.time.LocalTime;

public abstract class Kat extends Apartman {

    private LocalTime time = LocalTime.now();
    public String yanginTupu = "Her katta yangin tupu bulundurulmasi zorunlu";

    public abstract void kacinciKat();

    public boolean lambaYaniyorMu;

    public void lambaYak() {


        if (time.getHour() > 19 || time.getHour() < 6) {
            System.out.println("Lamba aciliyor...");
            System.out.println("Lamba acildi.");
            lambaYaniyorMu = true;
        }
    }


    public void lambaKapat() {


        if (time.getHour() > 6 && time.getHour() < 19) {
            System.out.println("Lamba kapatiliyor...");
            System.out.println("Lamba kapatildi.");
            lambaYaniyorMu = false;
        }
    }

    public void pano() {
        System.out.println("Panonun üstünde birkaç fatura bulunuyor");
        System.out.println("30-05-2024 tarihinde apartman toplantisi yapılıcaktir");
    }
}
