package day04increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Cift sayi!");
        }
        else System.out.println("Sayi tektir!");

        if (input>0){
            System.out.println("Pozitiftir");
        } else {
            System.out.println("Negatiftir");
        }

    }
}
