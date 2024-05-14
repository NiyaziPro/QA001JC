package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulation04 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.
            1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
            2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
            3- Başında ve sonunda boşluk olmamalıdır.*/

        // Not : isEmpty() : methodu sadece hicligi kontrol eder
        //      isBlank() : methodu ise hem hicligi hemde icinde sadece space karakteri var mi diye kontrol eder

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir password giriniz :");
        String password = input.nextLine();

        if (password.isEmpty()) {
            System.out.println("Lutfen en az bir karakter giriniz");
        }
        if (password.isBlank()) {
            System.out.println("Password sadece Space karakterinden ibadet olmamalidir");
        }
        if (!password.trim().equals(password)) {
            System.out.println("Password'un basinda ve sonunda bosluk olmamalidir");
        }

        /*
        String pwd="";//ali can

       //System.out.println(pwd.isEmpty());
       //System.out.println(pwd.isBlank());


        //1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        boolean first=pwd.isEmpty();
        System.out.println(first);


        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        boolean second=pwd.isBlank();
        System.out.println(second);

        //3- Başında ve sonunda boşluk olmamalıdır.
        boolean third=pwd.trim().equals(pwd);
        System.out.println(third);


        if (first){
            System.out.println("parola en az bir karakter'den olusmadilir");
        }if (second) {
            System.out.println("parola sadece bosluk karakterinden olusamaz");
        }if (!third){
            System.out.println("parolanın basında veya sonunda bosluk karakteri olamaz");
        } */

    }
}
