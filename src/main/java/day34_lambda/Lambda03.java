package day34_lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int number = input.nextInt();

        System.out.println("getFactorial(number) = " + getFactorial(number));


    } //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.

    public static int getFactorial(int number) {
        // int sayi degeri negatif olamaz cunku negatiflerin faktoriyeli yoktur
        // int number degeri 0 ise 1 dondurmemiz gerekiyor

        if (number == 0) {
            return 1;
        } else if (number < 0) {
            System.err.println("Negatif olamaz cunku negatiflerin faktoriyeli yoktur");
            return -1;
        } else {
            return IntStream.rangeClosed(1, number).reduce(Math::multiplyExact).getAsInt();
        }
    }

}
