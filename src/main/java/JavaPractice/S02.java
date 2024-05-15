package JavaPractice;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {

        //Kullanicidan bir double, bir'de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir ondalikli sayi giriniz : ");
        double num1 = input.nextDouble();
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int num2 = input.nextInt();

        // Birinci yol
        System.out.println("Girilen sayilarin toplami : "+(num1+num2));
        System.out.println("Girilen sayilarin carpimi : "+(num1*num2));
        System.out.println("------------------------------------------");

        // Iinci yol - method kullanimi
        toplam(num1,num2);
        carpim(num1,num2);


    }

    public static void toplam(double x,int y){
        System.out.println("Girilen sayilarin toplami : "+(x+y));
    }
    public static void carpim(double x,int y){
        System.out.println("Girilen sayilarin toplami : "+(x*y));
    }

}
