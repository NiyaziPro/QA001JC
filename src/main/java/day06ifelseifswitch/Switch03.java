package day06ifelseifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay numarasi giriniz :");
        byte monthNum = input.nextByte();

        switch (monthNum) {
            case 3, 4, 5:
                System.out.println("Ilk Bahar");
                break;
            case 6, 7, 8:
                System.out.println("Yaz");
                break;
            case 9, 10, 11:
                System.out.println("Son bahar");
                break;
            case 12, 1, 2:
                System.out.println("Kis");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz!");
        }
    }
}
