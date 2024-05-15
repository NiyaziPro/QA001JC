package JavaPractice;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        // int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        int a = 3;
        int b = 6;
        int c = 19;

        double ortalama = (a + b + c) / 3; //  (double) (a + b + c) / 3
        System.out.println("Sayilarin ortalamasi : " + ortalama);


        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir harf girin : ");
        char ch = input.next().charAt(0);

        int x = ch + 1;
        int y = ch + 2;
        int z = ch + 3;
        char ch1 = (char) x;
        char ch2 = (char) y;
        char ch3 = (char) z;
        //System.out.println(ch1 + ", " + ch2 + ", " + ch3);


        // Harfin ASCII değerini al
        int ascii = (int) ch;

        // Harf küçük harfse ve girilen karakter 'z' harfinden küçükse
        // ya da büyük harfse ve girilen karakter 'Z' harfinden küçükse
        if ((ch >= 'a' && ch <= 'z' && ch <= 'w') || (ch >= 'A' && ch <= 'Z' && ch <= 'W')) {
            // ASCII değerine 3 ekleyerek sonraki üç harfi elde et
            char nextChar1 = (char) (ascii + 1);
            char nextChar2 = (char) (ascii + 2);
            char nextChar3 = (char) (ascii + 3);

            System.out.println("Sonraki üç harf: " + nextChar1 + ", " + nextChar2 + ", " + nextChar3);
        } else {
            System.out.println("Hatalı giriş! Lütfen 'a' ile 'w' arasında (küçük harfler için) veya 'A' ile 'W' arasında (büyük harfler için) bir harf girin.");
        }


    }
}
