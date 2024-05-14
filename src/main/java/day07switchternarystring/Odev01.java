package day07switchternarystring;

import java.util.Scanner;

public class Odev01 {
    public static void main(String[] args) {
            /*
               Soru 2) Kullanicidan email adresini girmesini isteyin,
             mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
             @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
             @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
             odev!! bosluk karakteri varsada hata mesaji verin
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz :");
        String mail = input.nextLine();

        boolean cont = !mail.contains("@gmail.com");
        boolean endWith = !mail.endsWith("@gmail.com");
        boolean spaceControl = mail.contains(" ");

        if (cont){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (endWith){
            System.out.println("Lutfen yazimi kontol edin!");
        } else if (spaceControl) {
            System.out.println("Mail Space karakteri iceremez!");
        } else {
            System.out.println("Email adresiniz basariyla kaydedildi");
        }

    }
}
