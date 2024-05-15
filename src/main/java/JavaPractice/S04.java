package JavaPractice;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip , dikdortgenin alanini yazdirin
        // Dikdörtgenin iki komşu kenarının uzunluğunun çarpımı, dikdörtgenin alanına eşittir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen dikdortkenin kisa kenarini giriniz : ");
        double shortEdge = scan.nextDouble();
        System.out.print("Lutfen dikdortkenin uzun kenarini giriniz : ");
        double longEdge = scan.nextDouble();

        rectangleAreaCalculation(shortEdge, longEdge);


    }

    public static void rectangleAreaCalculation(double x, double y) {
        System.out.println("Dikdörtgenin alanı : " + x * y);
    }
}
