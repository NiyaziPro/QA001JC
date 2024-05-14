package Mentoring;

import java.util.Scanner;

public class TestSorulari13 {
    public static void main(String[] args) {
        // VKI hesaplayan kodu yazin (VKİ, bireyin vücut ağırlığının (kg),
        // boy uzunluğunun (m cinsinden) karesine (VKI=kg/m2) bölünmesiyle elde edilen bir değerdir.)
        //Verilen BMI degerleri için Vücut Kitle Indeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
        //Geçersiz BMI degeri < 0
        //Zayıf = <18.5
        //Normal agırlık = 18.5–24.9
        //Fazla kilolu = 25–29.9
        //Obezite = 30 veya daha büyük BMI

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen vucut ağırlığınızi kg olarak girin : ");
        double kg = scan.nextDouble();
        System.out.print("Lutfen boy uzunlugunuzu metre olarak girin : ");
        double boy = scan.nextDouble();

        double vki = kg / (boy * boy);
        System.out.println("Vucut kitle indeksiniz :" + vki + "'dir");


        if (vki < 0) {
            System.out.println("Gecersiz BMI degeri!");
        } else if (vki < 18.5) {
            System.out.println("Zayif");
        } else if (vki <= 24.9) {
            System.out.println("Normal agirlik");
        } else if (vki < 29.9) {
            System.out.println("Fazla kilolu");
        } else {
            System.out.println("Obezite");
        }

    }
}
