package day03casting_scanner_increment;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz :");
        String kullaniciAdi = scanner.next();
        System.out.println("kullaniciAdi = " + kullaniciAdi);

        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz.
        //Example 1: Ask the user for their age and print it to the console.

        System.out.println("Lutfen yasinizi giriniz:");
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();
        System.out.println("Girilen yas = " + age);


    }
}
