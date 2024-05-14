package day16passbyvalue_constructors_datetime;

public class KahveMakinesi {
    /*
        //pasif
        marka
        model
        renk
        kahveTuru
        //aktif
        kahveYapımı
         */
    String marka = "Philips";
    String model = "5400 Latte";
    String renk = "Siyah";
    String kahveTuru = "Kahve - Cekirdek";

    @Override
    public String toString() {
        return "KahveMakinesi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kahveTuru='" + kahveTuru + '\'' +
                '}';
    }

    public void on() {
        System.out.println("Makine baslatiliyor...");
        System.out.println("Su isitiliyor...");
        System.out.println("Makine kullanima hazir");
    }

    public String kahveOgutme() {
        System.out.println("Kahve ogutuluyor...");
        System.out.println("Kahve kullanima hazir");
        return "Toz kahve";
    }

    public void kahveHazirlanimi() {
        System.out.println("Makine calisiyor...");
        System.out.println("Kahve hazirlaniyor...");
        System.out.println("Kahve Hazir ! ");
        System.out.println("Afiyet olsun :)");
    }

    public void off() {
        System.out.println("Makine temizleniyor...");
        System.out.println("Bye bye :)");
    }
}
