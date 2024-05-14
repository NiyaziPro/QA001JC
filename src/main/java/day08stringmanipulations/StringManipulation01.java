package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        //     Soru 2) Kullanicidan email adresini girmesini isteyin,
        //             - mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        //             - @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
        //             - @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        //             - bosluk karakteri varsada hata mesaji verin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen E-Mail adresini giriniz :");
        String mail = input.nextLine();

        boolean cont = !mail.contains("@gmail.com");
        boolean endWith = mail.endsWith("@gmail.com");
        boolean spaceControl = mail.contains(" ");

        if (cont){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (spaceControl){
            System.out.println("email bosluk karakteri iceremez");
        }else if (endWith){
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazimi kontol edin ");
        }


    }
}
