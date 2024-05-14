package Mentoring;

import java.util.Scanner;

public class TestSorulari07 {
    public static void main(String[] args) {

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif sayi !");
        } else if (sayi < 0) {
            System.out.println("Negatif sayi !");
        } else {
            System.out.println("Notr sayi");
        }


    }
}
