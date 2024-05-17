package JavaPractice;

import java.util.Scanner;

public class S09 {

    public static void main(String[] args) {
        // Kullanicidan iki double sayi alin , ilk sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucunun tamsayi kismini yazdirin


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir ondalikli sayi girin : ");
        double num1 = input.nextDouble();
        System.out.print("Lutfen girdiginiz sayiyi kac ile bolmek isterseniz bir ondalikli sayi girin : ");
        double num2 = input.nextDouble();

        int result = (int)(num1/num2);
        System.out.println("Iki double sayinin int sonucu : "+result);
        System.out.println("Method kullanimi ile Iki double sayinin int sonucu : "+ multiply(num1, num2));


    }public static int multiply(double a , double b){
        return  (int) (a/b);
    }
}
