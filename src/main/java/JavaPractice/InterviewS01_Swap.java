package JavaPractice;

import java.util.Scanner;

public class InterviewS01_Swap {
    public static void main(String[] args) {
        /**Interview Sorusu !!! Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)  */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int number1 = input.nextInt();
        System.out.print("Lutfen ikinci bir tamsayi giriniz : ");
        int number2 = input.nextInt();

        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);

        // Swap islemi
        int temporary = number1;  // ucuncu degisken
        number1 = number2;
        number2 = temporary;

        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);
    }
}
