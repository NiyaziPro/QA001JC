package day04increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {
        // if (eger)(ако)
        // cok calisirsan basarili olursun
        //  (kosul:     )(sonuc:         )

        int sayi1 = 5;
        int sayi2 = 3;
        if (sayi1 > sayi2) // true
            System.out.println("Kosulumuz(Condition) doguru oldugu icin if calisir");

        if (7 == 4 + 3) // true
            System.out.println("Condition (kosul) dogru - if calisti");

        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.

        int num = 8;
        if (num >= 0 && num < 10)
            System.out.println("Rakam");

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.

        int number = 100;

        if (number > 99 && number < 1000) {
            System.out.println("Sayi üç basamaklidir");
        }
    }
}
