package day10loops;

public class NestedForLoop03 {
    public static void main(String[] args) {
        //  Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //           28.587 ==> 5+8+7=20         ===> Stringe cevirelim cunku split metodu ile ayirabiliriz

        double sayi = 28.587;
        String sNum = String.valueOf(sayi);
        String decimalParts = sNum.split("[\\.]")[1];
        System.out.println(decimalParts);
        // String uzerinde matematiksel islem yapamam bundan dolayi int cevirmem gerekiyo
        int intDecimalPart = Integer.parseInt(decimalParts);
        System.out.println(intDecimalPart);
        // parseInt () : methodu bir String ifadeyi int'e ceviren bir method'tur
        int sum = 0;
        for (int i = intDecimalPart; i > 0; i /= 10) {

            sum += i % 10;

        }
        System.out.println("sum = " + sum);
    }
}
