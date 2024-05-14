package constructor;

public class Televizyon {

    //pasif ozellikler
    String marka;
    String model;
    String boyut;
    String kalitesi;
    int fiyat;
    boolean interneteBaglimi;
    int sesDuzeyi = 0;

    //aktif ozellikler
    public void on() {
        System.out.println(marka + " aciliyor...");
        System.out.println(marka + " acildi hosgeldiniz");
    }

    public void off() {
        System.out.println(marka + " kapatiliyor...");
        System.out.println(marka + " kapatildi");
    }

    public boolean interneteBagla() {
        System.out.println("Internete baglaniyor...");
        System.out.println("Internete baglandi...");
        return true;
    }

    public void uygulamaYukle(boolean interneteBaglimi) {
        if (interneteBaglimi) {
            System.out.println("Internet oldugu icin yukleme yapiliyor");
        } else {
            System.out.println("Internet olmadigi icin yukleme yapilamiyor !");
        }
    }

    public void uygulamaSil() {
        System.out.println("Uygulamayi silmek istediginizden eminmisiniz?");
        System.out.println("Uygulama siliniyor...");
        System.out.println("Uygulama basariyla silinmistir!");

    }

    public void sesAc() {
        System.out.println("Ses aciliyor...");
        sesDuzeyi += 3;
        System.out.println("Ses duzeyi : " + sesDuzeyi);
    }

    public void sesKapa() {
        System.out.println("Ses kapatiliyor...");
        sesDuzeyi -= 3;
        if (sesDuzeyi > 0) {
            System.out.println("Ses duzeyi : " + sesDuzeyi);
        } else {
            System.out.println("Mute");
        }

    }


    //uygulama sil odev!!!!
    //ses acma kapatma odev!!!
    //3. pasif ozelliklere kolay deger atayabilmek icin constructor
    public Televizyon(String marka, String model, String boyut, String kalitesi, int fiyat, boolean interneteBaglimi) {
        this.marka = marka;
        this.model = model;
        this.boyut = boyut;
        this.kalitesi = kalitesi;
        this.fiyat = fiyat;
        this.interneteBaglimi = interneteBaglimi;
    }

    public Televizyon() {

    }
}
