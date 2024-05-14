package Mentoring;

public class TestSorulari16 {
    public static void main(String[] args) {
        //Carpim tablosu

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        // 20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sekilde aralarında bosluk
        //bırakarak yazdırmak için gereken kodu yazınız.

        String s = "";
        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                s = s + i + " ";
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(s);
    }
}
