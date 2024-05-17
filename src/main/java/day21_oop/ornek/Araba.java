package day21_oop.ornek;

public class Araba extends Vehicle {
    public String marka = "Honda";

    @Override
    public void petrolTuru() {
        System.out.println("Arabalarda genellikle benzin ve dizel petrolleri kullanilir.");
    }


}
