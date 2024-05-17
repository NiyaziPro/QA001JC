package JavaPractice;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, kullanici kac degerini girerse  girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int number = scanner.nextInt();

        byte number1 = (byte)number;
        System.out.println(number1);

    }
}
