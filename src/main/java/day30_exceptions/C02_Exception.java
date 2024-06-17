package day30_exceptions;

public class C02_Exception {
    public static void main(String[] args) {


        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9, 11};

        getir(c, a, b);

    }

    public static void getir(int[] c, int a, int b) {
        try {
            int index = a / b; // ArithmeticException
            int element = c[index]; //ArrayIndexOutOfException
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println("Burada bir aritmatik exception var : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Burada baska bir exception var : " + e.getMessage());
            e.printStackTrace();
        } finally { // kullaniciya bir bilgi vermek icin hata olsa yada olmasa bile calisan
            System.out.println("Bu finnaly yapisi nedir?");
        }
    }
}
