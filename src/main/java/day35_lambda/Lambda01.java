package day35_lambda;

import day34_lambda.Utils;

import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        System.out.println(getSumOfBetweenTwoInteger(12, 5));


        //4. Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini
        // veren kodu yazin baslangic ve bitis dahil degil
    }

    public static int getSumOfBetweenTwoInteger(int a, int b) {
        if (a > b) {
            int c = a;
            a = b;
            b = c;
//            a=a+b;
//            b=a-b;    Swap
//            a=a-b;
        }
        //return IntStream.range(a+1,b).filter(Utils::isNumberEven).reduce(Math::addExact).getAsInt();
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }
}
