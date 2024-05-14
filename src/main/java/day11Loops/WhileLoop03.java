package day11Loops;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(i + "*" + sayi + " = " + (sayi * i));
            i++;
        }
    }
}
