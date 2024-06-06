package day28_exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234a";

        int a = convertStringToInt(s);
        System.out.println(a + 1); // NumberFormatException


    }

    public static int convertStringToInt(String s) {
        int intS = 0;
        try {
            intS = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Girdigniz deger deger donusumune uygun degil : " + e.getMessage());
        }
        return intS;
    }
}
