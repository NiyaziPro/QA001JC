package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");

        if (scanner.hasNextInt()){ // eger girilen deger int ise  kontrol yapar
            int sayi = scanner.nextInt();

            if (sayi > 0) {
                System.out.println("Girilen sayi pozitiftir!");
            } else if (sayi < 0) {
                System.out.println("Girilen sayi negatiftir!");

            } else System.out.println("Girilen sayi notr'dur!");
        }
        else {
            System.out.println("Lutfen gecerli bir deger giriniz!");
        }
    }
}
