package JavaPractice;

import java.util.Scanner;

public class InterviewS02_Swap {
    public static void main(String[] args) {
        /**Interview Sorusu !!! Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan,
         *                       ikisinin degerlerini degistirin(swap)  */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int number1 = input.nextInt();
        System.out.print("Lutfen ikinci bir tamsayi giriniz : ");
        int number2 = input.nextInt();

        System.out.println("Değişmeden önce:");
        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);

        // Swap islemi

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Değiştikten sonra:");
        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);

    }
}
