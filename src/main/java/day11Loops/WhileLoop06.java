package day11Loops;

import java.util.Scanner;

public class WhileLoop06 {
    public static void main(String[] args) {
        /*Ornek 1:
      Gecerli Username="admin" ve Password="pwd123" dur.
      Kullanicidan username ve password'u alin.
      Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
      Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
      Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
*/


        Scanner input = new Scanner(System.in);
        String validUsername = "admin";
        String validPassword = "pwd123";

      //  for (int i = 3; i >= 0; i--) {
      //      System.out.println("Lutfen username'nizi giriniz :");
      //      String username = input.next();
      //      System.out.println("Lutfen password'unuzu giriniz :");
      //      String password = input.next();
//
      //      if (username.equals(validUsername) && password.equals(validPassword)) {
      //          System.out.println("Hesabiniza hosgeldiniz!");
      //      } else {
      //          System.out.println("Lutfen tekrar deneyiniz");
      //          System.out.println("Kalan deneme hakkiniz :" + i);
      //      }
      //      if (i == 0) {
      //          System.out.println("Hesabiniz bloke olmustur");
      //      }
//
//
      //  }

        int counter = 4;
        do {

            if (counter == 0) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Lutfen username'nizi giriniz :");
            String username = input.next();
            System.out.println("Lutfen password'unuzu giriniz :");
            String password = input.next();
            counter--;
            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            } else {
                System.out.println("Lutfen tekrar deneyiniz");
                System.out.println("Kalan deneme hakkiniz :" + counter);
            }
        }while(true);


        //   int sayac = 0;

        //   while (true) {

        //       if (username.equals(validUsername) && password.equals(validPassword)) {
        //           System.out.println("Hesabiniza hosgeldiniz!");
        //       } else {
        //           sayac++;

        //       }
        //   }


        /*

        /*Ornek 1:
      Gecerli Username="admin" ve Password="pwd123" dur.
      Kullanicidan username ve password'u alin.
      Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
      Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
      Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.


        Scanner input=new Scanner(System.in);
        String validUsername="admin";
        String validPassword="pwd123";
        //for (int i = 3; i >=0 ; i--) {
        //    System.out.println("lutfen username'nizi giriniz");
        //    String kullaniciName=input.next();
        //    System.out.println("lutfen password'unuzu giriniz");
        //    String  kullaniciPassw=input.next();
        //    if (kullaniciName.equals(validUsername)
        //            &&kullaniciPassw.equals(validPassword)){
        //        System.out.println("Hesabiniza hosgeldiniz!");
        //        break;
        //    }else {
        //        System.out.println("lutfen tekrar deneyiniz");
        //        System.out.println("kalan deneme hakkınız : "+i);
        //    }
        //    if (i==0){
        //        System.out.println("Hesabiniz bloke olmustur!!");
        //    }
        //}

/*
        int counter=4;
        do {
            if (counter==0){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Lutfen userName giriniz");
            String kullaniciName=input.next();


            System.out.println("lutfen password'unuzu giriniz");
            String  kullaniciPassw=input.next();
            counter--;
            if (kullaniciName.equals(validUsername)&&kullaniciPassw.equals(validPassword)) {
                System.out.println("hesabinize hosgeldiniz!");
                break;
            }else {
                System.out.println("lutfen tekrar deneyiniz kalan deneme hakkınız : "+counter);
            }


        }while (true);
         */
    }
}
