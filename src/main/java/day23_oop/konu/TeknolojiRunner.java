package day23_oop.konu;

public class TeknolojiRunner {
    public static void main(String[] args) {
        Teknoloji b = new Bilgisayar();
        // Bilgisayar b = new Teknoloji(); HATA

        Teknoloji t = new Telefon();

        Telefon t1 = new Telefon();

        t.cipSAyisi();
        System.out.println(t.cip);



    }
}
