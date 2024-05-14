package day07switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {
        // Ornek 1: Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.

        int year = 1996;
        String result = (year %100== 0)?(year % 400 ==0 ? year + " : Leap Year" : year + ": Leap year degildir") :
        (year % 4 ==0 ? year + " : Leap Year" : year + ": Leap year degildir");
        System.out.println(result);


    }
}
