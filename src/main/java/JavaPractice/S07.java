package JavaPractice;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin
        //Yarıçapı “r” uzunluğundaysa, çevresi 2 çarpı pi çarpı r'dir. ==> Cevre = 2*Pi*r
        //Dairenin alanı, pi çarpı yarıçapın karesidir ==> A = π r²

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir dairenin yaricapini giriniz : ");

        double r = input.nextDouble();

        double circleRadius = 2 * Math.PI * r;

        double areaOfCicle = Math.PI * r * r;

        System.out.println("Dairenin cevresi : " + circleRadius);
        System.out.println("Dairenin alani : " + areaOfCicle);


    }
}
