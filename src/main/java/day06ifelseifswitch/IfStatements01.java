package day06ifelseifswitch;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden notunuzu giriniz :");
        double not = input.nextDouble();

        if (not < 0) {
            System.out.println("Not bilgisi negatif olamaz");
        } else if (not < 50) {
            System.out.println("Notunuz : D");
        } else if (not < 60) {
            System.out.println("Notunuz : C");
        } else if (not < 80) {
            System.out.println("Notunuz : B");
        } else if (not < 100) {
            System.out.println("Notunuz : A");
        } else {
            System.out.println("Lutfen gecerli bir not bilgisi giriniz!");
        }
    }
}
