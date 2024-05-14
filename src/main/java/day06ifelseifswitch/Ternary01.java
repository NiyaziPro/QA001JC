package day06ifelseifswitch;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        // eger sayi negatif bir sayi ise -1 ile carpariz
        // eger sayi pozitifse herhangi bir islem yapmamıza gerek yok

        int c = -4;
        // condition         ?    true    :      false ;
        int result = c > 0   ?      c     :      c * -1;
        System.out.println(result);


    }
}
