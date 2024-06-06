package day28_exceptions;

public class E08 {
    public static void main(String[] args) {
        // Null yada 0 deger girdiginde NullPointerException firlatan bir method olusturun

        int a = 0;
        String b = null;

        //printValue(a);
        printValue(b);

    }


    public static void printValue(int value) {
        if (value != 0) {
            System.out.println(value);
        } else {
            throw new NullPointerException(" 0 deger giremezsiniz !");
        }
    }

    public static void printValue(String value) {
        if (value != null) {
            System.out.println(value);
        } else {
            throw new NullPointerException("Null deger giremezsiniz !");
        }
    }
}
