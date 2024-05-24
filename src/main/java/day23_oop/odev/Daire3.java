package day23_oop.odev;

public class Daire3 extends Kat implements DaireBilgisi,KapiBilgisi{

    @Override
    public void daireNo() {
        System.out.println("Daire No : 3");
    }

    @Override
    public void kapiTuru() {
        System.out.println("Demir kapi");
    }

    @Override
    public void zilSesi() {
        System.out.println("Kugu sesi");
    }

    @Override
    public void kacinciKat() {
        System.out.println("Bu daire birinci kat'ta bulunuyor");
    }
}
