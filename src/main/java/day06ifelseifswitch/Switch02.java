package day06ifelseifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
                        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay numarasi giriniz :");
        byte monthNum = input.nextByte();
        // boolean float double long data type lari switch icinde kullanilamaz
        switch (monthNum) { // String int byte char bu data turleri girebiliriz
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Subat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Austos");
            case 9:
                System.out.println("Eylul");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasim");
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli bir ay giriniz");
        }


    }
}
