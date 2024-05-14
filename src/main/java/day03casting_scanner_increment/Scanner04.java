package day03casting_scanner_increment;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        // i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        // ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir dikdortgenin kisa kenarini giriniz :");
        double shortSide = input.nextDouble();
        System.out.println("Lutfen bir dikdortgenin uzun kenarini giriniz :");
        double longSide = input.nextDouble();

        System.out.println("Alan : " + shortSide * longSide);
        System.out.println("Cevre : " + (2 * shortSide + 2 * longSide));


    }
}
