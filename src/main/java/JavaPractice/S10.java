package JavaPractice;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        // Kullanicidan bir double, bir tam sayi alin , double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucunun tamsayi kismini yazdirin


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir ondalikli sayi girin : ");
        double num1 = input.nextDouble();
        System.out.print("Lutfen girdiginiz sayiyi kac ile bolmek isterseniz bir tamsayi girin : ");
        int num2 = input.nextInt();

        int result = (int)(num1/num2);
        System.out.println("Result : " + result);
    }
}
