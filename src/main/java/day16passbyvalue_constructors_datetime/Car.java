package day16passbyvalue_constructors_datetime;

public class Car {

    //1- variable ler (pasif ozellikler) olusturalım
    String marka = "Honda";
    String model = "Civic";
    String renk = "Kirmizi";
    int year = 2024;
    String benzinTuru = "Benzin";
    int kapiSayisi = 4;

    // 2 Method'lari (aktif ozellikler ) olusturalim
    public void hareket() {
        System.out.println("Araba calismaya basladi");
        System.out.println("Araba hızlanıyor");
        System.out.println(marka+" Hızlı hareket ediyor.");

    }

    public void dur() {
        System.out.println("Araba yavaslıyor");
        System.out.println("Araba durdu");
        System.out.println(marka+" Calismayi durdurdu");

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.hareket();
    }
    //3 constructorlar
    //Access modifier    //class ismi         //parametre parantezi //body yani kodun yazildigi yer
    public               Car                   ()                  {

    }
}
