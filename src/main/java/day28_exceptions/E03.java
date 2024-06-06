package day28_exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        //geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        System.out.println(s.charAt(2)); // v

        karakterSec(s, 5);
        karakterSec(s, 0);

        System.out.println("1.Kodlarimiz  calismaya devam ediyormu...");

        karakterSec(s, 7);

        System.out.println("2.Kodlarimiz  calismaya devam ediyormu...");
    }

    public static void karakterSec(String string, int index) {
        try {
            System.out.println(string.charAt(index)); // StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan indexleri kullanmayiniz : " + e.getMessage());
            e.printStackTrace(); //StringIndexOutOfBoundsException exception'i gorduk ve calismaya
                                // devam ediyor cunku printstacktrace methodu exception fırlatmaz sadece gosterir
        }

    }
}
