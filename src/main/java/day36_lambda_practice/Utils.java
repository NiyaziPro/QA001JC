package day36_lambda_practice;

public class Utils {

    public static boolean isNumberOdd(int number) {
        return number % 2 != 0;
    }

    public static void printObject(Object object) {
        System.out.print(object + " ");
    }

    public static boolean isNumberDivisibleFive(int number) {
        return number % 5 == 0;
    }

    public static boolean isNumberSmallerThanTen(int number) {
        return number < 10;
    }

    public static Integer squaringANumber(int number) {
        return number * number;
    }

    public static boolean isNumberDivisibleThree(Integer number) {
        return number % 3 == 0;
    }

    public static boolean isNumberNotDivisibleThree(Integer number) {
        return number % 3 != 0;
    }

    public static boolean isNumberDivisibleFour(Integer number) {
        return number % 4 == 0;
    }

    public static int cubeANumber(Integer number) {
        return number * number * number;
    }

    public static boolean isNumberGreaterThanSeven(int number) {
        return number > 7;
    }

    public static boolean isNumberGreaterThanTwelve(int number) {
        return number > 12;
    }

    public static Integer sum(Integer total, Integer number) {
        total += number;
        return total;
    }


    public static Integer sqrt(Integer number) {
        Double karekok = Math.sqrt(number);
        return karekok.intValue();
    }

    public static Integer multiply(Integer integer, Integer integer1) {
        integer *= integer1;
        return integer;
    }

    public static boolean isDontStartWithA(String s) {
        return !s.toLowerCase().startsWith("a");
    }

    public static boolean isLengthSmallerThanSeven(String s) {
        return s.length() < 7;
    }

    public static boolean isLengthGreaterThanSix(String s) {
        return s.length() > 6;
    }

    public static boolean withoutCapitalLetters(String s) {
        return s.equals(s.toLowerCase());
    }
}
