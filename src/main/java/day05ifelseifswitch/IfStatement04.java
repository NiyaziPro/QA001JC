package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        // Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun giriniz :");
        double doubleNum = scanner.nextDouble();
        int num = (int) doubleNum;
        if (doubleNum != num) {
            System.out.println("Lutfen tam sayi giriniz");
        } else {

            if (num < 0)
                System.out.println("Gun sayilari 1'den kucuk olamaz!");
            else if (num == 1) {
                System.out.println("Pazar");
            } else if (num == 2) {
                System.out.println("Pazartesi");
            } else if (num == 3) {
                System.out.println("Sali");
            } else if (num == 4) {
                System.out.println("Carsamba");
            } else if (num == 5) {
                System.out.println("Persembe");
            } else if (num == 6) {
                System.out.println("Cuma");
            } else if (num == 7) {
                System.out.println("Cumartesi");
            } else System.out.println("Gun sayilari 7'den buyuk olamaz!");
        }

        //  double numDouble = scanner.nextDouble();
        //  int num1 = (int)numDouble;
        //  if (numDouble!=num1)
        //      System.out.println("Lutfen tam sayi giriniz!");
        //  else
        //      if (num1>0)
        //          System.out.println("Sayi pozitiftir");

    }


}

