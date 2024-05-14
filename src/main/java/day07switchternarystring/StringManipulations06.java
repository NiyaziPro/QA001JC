package day07switchternarystring;

import java.util.Scanner;

public class StringManipulations06 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
	                i)  En az 8 karakter olsun
	                ii) Space karakteri password'de olmasin
	                iii)En az bir tane buyuk harf olsun
	                iv) En az bir tane kucuk harf olsun
	                v)  En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password'unuzu giriniz :");
        String password = input.nextLine();
        // alican123A
        // i)  En az 8 karakter olsun
        boolean lenghtControl = password.length() >= 8;
        System.out.println("lenghtControl = " + lenghtControl);

        //  ii) Space karakteri password'de olmasin
        boolean spaceControl = !password.contains(" ");
        System.out.println("spaceControl = " + spaceControl);

        // iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        // iv) En az bir tane kucuk harf olsun
        boolean lowerCaseControl = password.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        // v)  En az bir tane rakam olsun
        boolean digitControl = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("digitControl = " + digitControl);

        boolean isValid = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if (isValid) {
            System.out.println("Sifre gecerlidir");
        } else {
            System.out.println("Sifre Gecerli degildir");
            if (!digitControl){
                System.out.println("En az bir tane rakam icermeli");
            }
            if (!spaceControl){
                System.out.println("Password Space karakteri iceremez");
            }
            if (!upperCaseControl){
                System.out.println("En az bir tane buyuk harf giriniz");
            }
            if (!lowerCaseControl){
                System.out.println("En az bir tane kucuk harf giriniz");
            }
            if (!lenghtControl){
                System.out.println("Password en az 8 karaktere sahip olmali");
            }
        }


    }
}
