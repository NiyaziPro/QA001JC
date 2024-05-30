package day23_oop.konu;

import java.util.ArrayList;
import java.util.List;

public class TeknolojiRunner {
    public static void main(String[] args) {
        Teknoloji b = new Bilgisayar();
        // Bilgisayar b = new Teknoloji(); HATA

        Teknoloji t = new Telefon();

        Telefon t1 = new Telefon();

        t.cipSAyisi();
        System.out.println(t.cip);

        Telefon telefon1 = new Telefon();
        Telefon telefon2 = new Telefon();
        Telefon telefon3 = new Telefon();
        Telefon telefon4 = new Telefon();

        List<Telefon> telefonList = new ArrayList<>();
        telefonList.add(telefon1);
        telefonList.add(telefon2);
        telefonList.add(telefon3);
        telefonList.add(telefon4);

        System.out.println(telefonList);


    }
}
