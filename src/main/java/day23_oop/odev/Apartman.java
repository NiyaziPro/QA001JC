package day23_oop.odev;

import java.time.LocalDate;

public class Apartman {
    public String mahalle = "Hanse";

    public String name = "OOP apartmani";

    public boolean aidatOdendiMi = false;

    public void aidatOde() {
        if (aidatOdendiMi) {
            System.out.println("Siz zaten aidat odediniz.");
        } else {
            System.out.println("Aidati odediginiz icin tesekkurler.");
            aidatOdendiMi = true;
        }
    }

    public void aidatOdenmedi() {
        // Odev-kullanıcı aidati 3 ay boyunca odemezse olusacak bir uyarı mesajı veriniz
        int counter = 0;


    }

    public void aidatBilgisi() {
        LocalDate date = LocalDate.now();
        if (date.getDayOfMonth() == 15) {
            aidatOdendiMi = true;
        }
        if (aidatOdendiMi) {
            System.out.println("Siz zaten aidat'i odediniz.");
        } else {
            System.out.println("Aidati odediginiz icin tesekkurler.");
            aidatOdendiMi = true;
        }
    }


    public static final String aidat = "Aidat 50€";

    public void temelBilgi() {
        System.out.println("Apartman dort katlidir ve iki giris cikisi vardir");
        System.out.println("Bahcesinde kucuk bir oyun alani vardir");
        System.out.println("16 araclik park yeri bulundurmaktadir");
    }
}
