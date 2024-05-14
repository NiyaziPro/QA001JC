package sorular;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        // Soru 1) Ekrana 10 kez "Java candir, sonrasi heyecan" yazdirin

        String str = "Java candir, sonrasi heyecan";

        for (int i = 1; i < 11; i++) {
            System.out.println(str);

        }

        // Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
        //virgul olarak ayni satirda yazdirin

        for (int i = 10; i < 31; i++) {
            //System.out.print(i+",");
            if (i == 30) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }

        }
        System.out.println();
        System.out.println("------------");

        // soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

        int a = 10;

        for (int i = 1; i < 11; i++) {
            System.out.println(i + "*" + a + " = " + (a * i));
        }

        System.out.println("---------------");

        // Soru 4 . Kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz :");
        int sayi = input.nextInt();
        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
            carpim *= i; // carpim = carpim*i;
            System.out.println(carpim);

        }
        System.out.println(sayi + " ! = " + carpim);


    }
}
