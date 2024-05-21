package day22_oop.abstractClass.ornek;

public class VehicleRunner {
    public static void main(String[] args) {
        Honda h = new Honda();
        Mercedes m = new Mercedes();
        Kawasaky k = new Kawasaky();

        h.engine();
        h.kasaTuru();
        h.model();
        h.yakitTuru();

        System.out.println("--------------------");

        m.yakitTuru();
        m.engine();
        m.tekerSayisi();

        System.out.println("--------------------");

        k.engine();
        k.tip();
        k.yakitTuru();
        k.tekerKalinligi();
    }
}
