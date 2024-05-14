package constructor;

public class TelevizyonRunner {
    public static void main(String[] args) {
        Televizyon tv1 = new Televizyon();
        tv1.marka = "Samsung";
        tv1.model = "S1";
        tv1.boyut = "75 inc";
        tv1.kalitesi = "4k ultra hd";
        tv1.fiyat = 2500;
        tv1.interneteBaglimi = false;
        tv1.on();
        System.out.println("---------------------");
        //tv1.interneteBaglimi = tv1.interneteBagla();
        System.out.println("---------------------");
        tv1.uygulamaYukle(tv1.interneteBaglimi);
        System.out.println("---------------------");
        tv1.off();

        Televizyon tv2 = new Televizyon("Philips", "P01", "65 inc", "Full HD", 1200, false);
        tv2.on();
        tv2.uygulamaYukle(tv1.interneteBaglimi);
        tv2.off();
        tv2.sesAc();
        tv2.sesAc();
        tv2.sesAc();
        tv2.sesAc();
        tv2.sesKapa();
        tv2.sesKapa();
        tv2.sesKapa();
        tv2.uygulamaSil();
    }
}
