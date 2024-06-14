package day29_exceptions;

import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        String str = "Java bugun cok eglenceli".toLowerCase();
        /*
        kullanicidan bir harf alınız ve aldıgınız harfin indexini dondurunuz
        not: bu durumda olusabilecek exceptionlari try catch ile kontrol altına aliniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        String harf = input.next();

        try {
            if (str.contains(harf)) {
                System.out.println(str.substring(0, str.indexOf(harf)));
            } else {
                throw new ContainsCharacterException("icermeyen bir harf girdiniz");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("1. catch lutfen cumlenin icinde bulunan bir harf giriniz");
        } catch (ContainsCharacterException e) {
            System.out.println("2. catch lutfen cumlenin icinde bulunan bir harf giriniz");
        }

    }
}