package JavaPractice;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        // Kullanicidan ismini soyismini ve yasini alip asagidaki formatta yazdirin
        //            girilen bilgiler : John Doe 44 ==> cikti : J Doe, 44

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String name = scan.next();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String surname = scan.next();
        System.out.print("Lutfen yasinizi giriniz : ");
        int age = scan.nextInt();

        System.out.println(name.charAt(0)+" "+surname+", "+age); // J Doe, 44

        view(name,surname,age);


    }

    public static void view(String name , String surname, int age){
        System.out.println(name.charAt(0)+" "+surname+", "+age);
    }
}
