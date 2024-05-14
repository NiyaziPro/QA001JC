package day06ifelseifswitch;

public class IfStatements03 {
    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran

        int sayi = 50;
        // System.out.println(Math.pow(sayi, 8)); (корен квадрат на 8 ма степен)
        if (sayi > 100) {
            System.out.println(sayi + sayi);
        } else {
            System.out.println("Sayi 100'den buyuk olmali !");
        }

    }
}
