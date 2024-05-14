package day03casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
            i)Adini ve Soyadini
            ii)Yaşını
            iii)Boyunu
            iv)Kilosunu
            v)Medeni durumunu girmesini isteyin.
        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        Example 1:
        From the user;
            i) Name and Surname
            ii) Age
            iii)Height
            iv) Weight
            v) Ask him to enter his marital status.
        Then print them on separate lines in the console with a label*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz :");
        String fullName = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz :");
        byte age = scanner.nextByte();

        System.out.println("Lutfen boyunuzu giriniz :");
        double height = scanner.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz :");
        double weight = scanner.nextDouble();

        System.out.println("Lutfen medeni durumunuzu giriniz :");
        String maritalStatus = scanner.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

    }
}
