package day21_oop.ornek;

public class Honda extends Araba {
    public String motorGucu = "150PS";
    public String model = "Civic";
    private String ruhsatBilgisi = "A10E89C44GFB";

    @Override
    public void petrolTuru() {
        System.out.println("Honda markasi genellikle benzinli araclar uretir");
    }


    public String getRuhsatBilgisi() {
        return ruhsatBilgisi;
    }
    public Honda (){
        marka = "Honda";

    }


}
