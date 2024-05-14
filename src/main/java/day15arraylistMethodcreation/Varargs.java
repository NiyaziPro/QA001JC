package day15arraylistMethodcreation;

import java.security.spec.RSAOtherPrimeInfo;

public class Varargs {
    public static void main(String[] args) {
        int sonuc = toplama(3, 4, 5, 6, 7, 8, 10, 20, 34, 234, 99);
        System.out.println("sonuc = " + sonuc);

        System.out.println(concatination("Java", " candir ", "gerisi ", "heyecan."));

    }

    public static int toplama(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }

    public static String concatination(String... a) {
        String str = "";
        for (String w : a) {
            str += w;

        }
        return str;
    }
}
