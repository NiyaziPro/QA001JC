package JavaPractice;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        /*
        Kullanicidan uc farkli data turunde deger alip ,
        girilen degerleri aciklamalariyla yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int tamsayi = scan.nextInt();
        System.out.print("Lutfen bir karakter giriniz : ");
        char ch = scan.next().charAt(0);
        System.out.print("Lutfen bir kelime giriniz : ");
        String word = scan.next();

        System.out.println("Tamsayi : " + tamsayi + "\nKarakter : " + ch + "\nKelime : " + word);

    }
}
