package day25_collections.konu;

import java.util.HashSet;
import java.util.TreeSet;

public class Set04 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        long t1 = System.nanoTime();
        // 1.yol
        TreeSet<String> emailler = new TreeSet<>();

        emailler.add("velican@gmail.com");
        emailler.add("alican@gmail.com");
        emailler.add("hasancan@gmail.com");
        emailler.add("emrecan@gmail.com");

        System.out.println(emailler);

        long t2 = System.nanoTime();


        // 2.yol
        HashSet<String> emailsHS = new HashSet<>();
        emailsHS.add("velican@gmail.com");
        emailsHS.add("alican@gmail.com");
        emailsHS.add("hasancan@gmail.com");
        emailsHS.add("emrecan@gmail.com");
        System.out.println(emailsHS);

        TreeSet<String> emailsTS = new TreeSet<>(emailsHS);
        System.out.println(emailsTS);

        long t3 = System.nanoTime();

        System.out.println(t2-t1); // treeset - 1062900
        System.out.println(t3-t2); // hashset -  402700

    }
}
