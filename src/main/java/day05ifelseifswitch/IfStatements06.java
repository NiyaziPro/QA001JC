package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {
        // Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        //	Pazartesi ==> Hafta ici      Cumartesi ==> Hafta sonu


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz :");
        String gunIsmi = input.next();

        boolean haftaIciMi = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaIciMi) {
            System.out.println("Hafta ici");
        } else if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz!");
        }


    }
}
