package day29_exceptions;

import java.util.Scanner;

public class C02_Exception {
    //kullanicidan lunapark'taki bir oyuncaga binmek icin asagidaki kosullari saglamasi gerekmektedir
    // herhangi bir kosul hatali ise bir exception firlatin fakat
    // firlatilcak olan exceptioni kendiniz olusturun ve 1 kosul gecilmeden 2. kosul kontrolu yapılmasin
    //kosullar :
    //1. kosul yasi 15'ten buyuk olmali
    //2. kosul kilosu 100'den kucuk olmali
    //3. kosul saglık problemi olmasin
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" Lunapark ABC'ye Hosgeldiniz");
        System.out.println("Lutfen yasinizi giriniz :");
        int age = input.nextInt();
        if (age < 15) {
            throw new AgeException("Yasiniz 15'ten kucuk ise bu oyuncagi kullanamazsiniz!");
        } else {
            System.out.println("Lutfen kilonuzu kg olarak giriniz :");
            double weight = input.nextDouble();
            if (weight > 100) {
                throw new WeightException("Kilonuz 100'den buyuk ise bu oyuncagi kullanamazsiniz!");
            }else {
                System.out.println("Saglik probleminiz varmi \nEvet icin 'E' Hayir icin 'H'");
                String healt = input.next();
                if (healt.equalsIgnoreCase("E")){
                    throw new HealtProblemException("Saglik problemi dolayisiyla bu oyuncagi kullanamazsiniz!");
                }else {
                    System.out.println("Oyuncagi kullanabilirsiniz...");
                }
            }
        }




    }


}
