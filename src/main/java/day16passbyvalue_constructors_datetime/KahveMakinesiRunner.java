package day16passbyvalue_constructors_datetime;

public class KahveMakinesiRunner {
    public static void main(String[] args) {

        KahveMakinesi kM1 = new KahveMakinesi();

        System.out.println(kM1);
        kM1.on();
        kM1.kahveOgutme();
        kM1.kahveHazirlanimi();
        kM1.off();


    }
}
