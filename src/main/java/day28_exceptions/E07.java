package day28_exceptions;

public class E07 {

    public static void main(String[] args) {
        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.

        //Girdigimiz yasi konsola yazdiran bir method olusturalim

        printAge(25);
        printAge(-3); // yas degeri eksi olamaz/ bir hata mesazi vermemiz gerekir

        System.out.println("Kodlarimiz calismaya devam ediyor mu?");

    }

    public static void printAge(int age) {
        if (age >= 0) {
            System.out.println(age);
        } else {
            throw new IllegalArgumentException("Yasi negatif girmeyiniz !");
        }
    }
}
