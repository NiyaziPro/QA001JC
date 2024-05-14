package day10loops;

import java.util.Scanner;

public class NestedForLoop02 {
    public static void main(String[] args) {
        /* Ornek 2:
            Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                     X X X X X
                     X X X X X
                     X X X X X   */

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        // GELISTIRME: satir ve sutun sayilarini  kullanicidan alalim.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = input.nextInt();
        System.out.println("lutfen sutun sayisini giriniz");
        int sutun = input.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
