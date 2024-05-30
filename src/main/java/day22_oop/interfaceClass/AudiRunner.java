package day22_oop.interfaceClass;



public class AudiRunner {
    public static void main(String[] args) {
        AudiA4 a4 = new AudiA4();
        a4.turbo(); // Audi A4 turbo motor kullanir
        a4.analog(); // Audi A4 analog klima  kullanir
        a4.esp(); // Audi A4 ABS fren sistemi kullanir
        ((Fren) a4).run(); // Audi A4 Hava yastigini acti
        System.out.println(AudiA4.fiyat);

        AudiS5 s5 = new AudiS5();
        s5.abs(); // Audi S5 ABS fren sistemi kullanır
        ((Motor) s5).run(); // Audi S5 lazer far calistirdi
        System.out.println(AudiS5.fiyat);




    }
}
