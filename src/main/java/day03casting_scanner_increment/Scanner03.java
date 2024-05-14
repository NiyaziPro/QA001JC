package day03casting_scanner_increment;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve
        // islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        //Example 3: Write the code that takes two numbers from the user,
        // performs 4 operations and displays the results of the operations on the screen.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz :");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        double toplam = sayi1 + sayi2;
        double cikarma = sayi1 - sayi2;
        double carpma = sayi1 * sayi2;
        double bolme = sayi1 / sayi2;

        System.out.println("Toplama = " + toplam);
        System.out.println("Cikarma = " + cikarma);
        System.out.println("Carpma = " + carpma);
        System.out.println("Bolme = " + bolme);

        //1. adım oncelikle scanner objesini olusturmak
        Scanner input = new Scanner(System.in);
        //2.adım kullanıciya bir bilgi verelim
        System.out.println("lutfen 2 tane sayi giriniz");
        //3. adım kullanıcının girdigi degeri bir variable'a atayalım
        //int sayi=(int )input.nextInt();
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Sum : " + (firstNumber + secondNumber));//toplamı
        System.out.println("subtraction : " + (firstNumber - secondNumber));//farkı
        System.out.println("Multiplication : " + firstNumber * secondNumber);//carpimlari
        System.out.println("Division : " + firstNumber / secondNumber);//bolme
        //Not carpma ve bolme işlemi icin parantez kullanmadım cunku bunlar zaten + işleminden once gelir

        System.out.println("Division : " + String.format("%.2f", firstNumber / secondNumber));


    }
}
