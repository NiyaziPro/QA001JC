package Mentoring;

import java.util.Scanner;

public class TestSorulari11 {

    public static void main(String[] args) {
        //Verilen BMI degerleri için Vücut Kitle Indeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
        //Geçersiz BMI degeri < 0
        //Zayıf = <18.5
        //Normal agırlık = 18.5–24.9
        //Fazla kilolu = 25–29.9
        //Obezite = 30 veya daha büyük BMI

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Vucut kitle indeksi  degerlerini giriniz : ");
        double bmi = scan.nextDouble();

        if (bmi < 0) {
            System.out.println("Gecersiz BMI degeri!");
        } else if (bmi < 18.5) {
            System.out.println("Zayif");
        } else if (bmi <= 24.9) {
            System.out.println("Normal agirlik");
        } else if (bmi < 29.9) {
            System.out.println("Fazla kilolu");
        } else {
            System.out.println("Obezite");
        }

    }
}
