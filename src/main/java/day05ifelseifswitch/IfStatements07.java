package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatements07 {
    public static void main(String[] args) {

        /* Ornek 1:
             Kisi erkek ise;
                   i)16 yasindan kucuk ise calismamali
                   ii)16 - 65(Dahil) arasi calismali
                   iii)65 yasindan buyuk ise emekli olmali
             Kisi kadin ise;
                  i)18 yasindan kucuk ise calismamali
                  ii)18 - 60 (dahil) arasi calismali
                  iii)60 yasindan buyuk ise emekli olmali
            Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz:");
        String gender = input.next();

        System.out.println("Yasinizi lutfen giriniz :");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Erkek")) {
            if (age < 0) {
                System.out.println("Yas negatif olamaz");
            } else if (age < 16) {
                System.out.println("Calismamali");
            } else if (age <= 65) {
                System.out.println("Calismali");

            } else {
                System.out.println("Emekli olmali");
            }

        } else if (gender.equalsIgnoreCase("Kadin")) {
            if (age < 0) {
                System.out.println("Yas negatif olamaz");
            } else if (age < 18) {
                System.out.println("Calismamali");
            } else if (age <= 60) {
                System.out.println("Calismali");

            } else {
                System.out.println("Emekli olmali");
            }

        } else {
            System.out.println("Sizin icin farkli bir tanimlama yapilmadi!");
        }


    }
}
