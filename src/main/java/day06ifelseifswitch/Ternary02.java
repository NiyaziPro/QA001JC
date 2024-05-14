package day06ifelseifswitch;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz.

        int num1 = 4;
        int num2 = 6;

        Object result = num1*num2>0 ? num1 * num2 : "Farkli isaretli sayilari carpamiyorum";


        Object result1 = (num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0) ? num1 * num2 : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(result);
        System.out.println(result1);
    }
}
