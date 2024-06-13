package proje.loginPageApp;


import java.util.Scanner;

public class PasswordEmailControl {
    public static boolean isValidPassword(String password) {

    /*
          password validation: boşluk içermemeli
          : en az 6 karakter olmalı
          : en az bir tane küçük harf içermeli
          : en az bir tane büyük harf içermeli
          : en az bir tane rakam içermeli
          : en az bir tane sembol içermeli
          */

        // boşluk içermemeli
        boolean spaceControl = !password.contains(" ");

        // en az 6 karakter olmalı
        boolean lenghtControl = password.length() >= 6;

        // en az bir tane küçük harf içermeli
        boolean lowerCaseControl = password.replaceAll("[^a-z]", "").length() > 0;

        // en az bir tane büyük harf içermeli
        boolean upperCaseControl = password.replaceAll("[^A-Z]", "").length() > 0;

        // en az bir tane rakam içermeli
        boolean digitControl = password.replaceAll("[^0-9]", "").length() > 0;

        // en az bir tane sembol içermeli
        boolean symbolControl = password.matches("(?=.*[!@#$%^&*(),.?\\\":{}|<>]).+$");


        boolean isValid = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl;

        if (isValid) {
            //System.out.println("Sifre gecerlidir.");
        } else {
            System.err.println("Sifre Gecerli degildir! Lutfen tekrar deneyin.");
            if (!spaceControl) {
                System.err.println("Password bosluk iceremez!");
            }
            if (!lenghtControl) {
                System.err.println("Password En az 6 karakter icermelidir!");
            }
            if (!lowerCaseControl) {
                System.err.println("Password En az bir tane kucuk harf icermelidir!");
            }
            if (!upperCaseControl) {
                System.err.println("Password En az bir tane buyuk harf icermelidir!");
            }
            if (!digitControl) {
                System.err.println("Password En az bir tane rakam icermelidir!");
            }
            if (!symbolControl) {
                System.err.println("Password En az bir sembol icermelidir!");
            }
            return false;
        }
        return isValid;
    }

    public static boolean isValidEmail(String email) {

        //email validation:
        // boşluk içermemeli
        // : @ içermeli
        // : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
        // : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.


        // boşluk içermemeli
        boolean spaceControl = !email.contains(" ");
        // @ içermeli
        boolean cont = email.contains("@");
        boolean cont2 = email.indexOf("@") == email.lastIndexOf("@");
        //gmail.com,hotmail.com veya yahoo.com ile bitmeli.
        boolean endWith = email.endsWith("@gmail.com") || email.endsWith("@hotmail.com") || email.endsWith("@yahoo.com");

        //mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
        boolean beginWith = email.split("@")[0].matches("[a-zA-Z0-9._-]+");

        boolean isValid = spaceControl && cont && cont2 && endWith && beginWith;

        if (isValid) {

            //System.out.println("Girilen e-mail gecerlidir.");
        } else {
            System.err.println("E-mail Gecerli degildir! Lutfen tekrar deneyin.");
            if (!spaceControl) {
                System.err.println("E-mail bosluk iceremez!");
            }
            if (!cont) {
                System.err.println("E-mail @ icermelidir!");
            }
            if (!cont2) {
                System.err.println("E-mail tek bir @ icermelidir!");
            }
            if (!endWith) {
                System.err.println("E-mail gmail.com,hotmail.com veya yahoo.com ile bitmelidir! ");
            }
            if (!beginWith) {
                System.err.println("E-mailin kullanıcı adı kısmında sadece büyük-küçük harf,rakam yada - . _ sembolleri olabilir!");
            }

            return false;
        }


        return isValid;
    }

}
