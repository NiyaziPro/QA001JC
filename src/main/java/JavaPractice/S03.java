package JavaPractice;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin :

                Isminiz     : John
                Soyisminiz  : Doe
                Yasiniz     : 44
                Kaydiniz Basariyla tamamlanmistir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String name = scan.next();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String surname = scan.next();
        System.out.print("Lutfen yasinizi giriniz : ");
        byte age = scan.nextByte();

        System.out.println("Isminiz    : " + name + "\nSoyisminiz : " + surname + "\nYasiniz    : " + age + "\nKaydiniz Basariyla tamamlanmistir !");

        info(name, surname, age);
    }

    public static void info(String name, String surname, int age) {
        System.out.println("Isminiz    : " + name + "\nSoyisminiz : " + surname + "\nYasiniz    : " + age + "\nKaydiniz Basariyla tamamlanmistir !");
    }
}
