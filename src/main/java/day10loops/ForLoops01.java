package day10loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //  Ornek 1: 6'dan 10'a kadar tum int’lerin toplamini console'a yazdiriniz
        //          6+7+8+9+10=40 ==> 40

        int sum = 0;
        for (int i = 6; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);


        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console'a yazdiriniz
//          10x9x8x7 ==> 5040
        int carpma = 1;
        for (int i = 10; i >= 7; i--) {
            carpma *= i;
        }
        System.out.println("Carpma : " + carpma);

    }
}
