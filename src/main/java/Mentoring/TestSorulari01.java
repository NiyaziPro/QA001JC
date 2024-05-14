package Mentoring;

import java.util.Scanner;

public class TestSorulari01 {
    public static void main(String[] args) {


        // Kullanıcıdan ismini aldıktan sonra,
        // o ismin tüm harflerini büyük harfe çevirmek için Aşağıdaki kodlardan hangisi yazılmalıdır?
        //  Scanner input = new Scanner(System.in);
        //  System.out.println("Lutfen isminizi giriniz :");
        //  String name = input.nextLine();
        //  System.out.println(name.toUpperCase());

        // Größer-Kleiner-Vergleich: Schreibe ein Java-Programm,
        // das zwei Zahlen vergleicht und ausgibt, welche größer ist oder ob sie gleich sind.

        int a = 210;
        int b = 30;
        if (a < b) {
            System.out.println(a + " ist kleiner als " + b);
        } else if (a == b) {
            System.out.println(a + " ist gleich als " + b);

        }else {
            System.out.println(a+ " ist grosser als "+b);

            String s = "Learn";
            String t = "Java";
            System.out.println(s.length() > s.charAt(2));


        }

    }
}
