package proje.loginPageApp.ornek;

import java.util.Scanner;

public class LoginPageApp {
    public static void main(String[] args) {
         /*

          Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

          menü: kullanıcıya işlem seçimi için menü gösterilir.//switch+do while

          üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
          email ve şifre birer listede tutulur.
          aynı email kabul edilmez.//unique

          giriş(login): email ve şifre girilir.
          email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
          email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

          email validation: boşluk içermemeli
          : @ içermeli
                           : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                                   : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

          password validation: boşluk içermemeli
          : en az 6 karakter olmalı
          : en az bir tane küçük harf içermeli
          : en az bir tane büyük harf içermeli
          : en az bir tane rakam içermeli
          : en az bir tane sembol içermeli
          */

        // 1. Kullanici class'i olusturup tum ozelliklerini o class'a tasiyalim
        // 2. kullanici ile ilgili

//        UserService userService = new UserService();
//        userService.register();

        start();

    }

    public static void start() {
        Scanner input = new Scanner(System.in);

        // userservicten bir obje olusturalim
        UserService userService = new UserService();
        int select;

        do {
            System.out.println("********** Techpro Education **********");
            System.out.println("1. Uye ol");
            System.out.println("2. Giris yap");
            System.out.println("0. Cikis");
            select = input.nextInt();
            switch (select) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 0:
                    System.out.println("Iyi gunler dileriz...");
                    break;
                default:
                    System.out.println("Hatali giris");
                    break;
            }

        } while (select != 0);
    }
}
