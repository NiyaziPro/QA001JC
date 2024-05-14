package day09loops;

public class ForLoops07 {
    public static void main(String[] args) {
        // ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz
        //          578 ==> 5+7+8=20 ==> Output 20 olmali
        int sayi = 578;
        int sum = 0;
        //  int birlerBasamagi = sayi % 10;
        //  sayi=sayi/10;
        //  int onlarBasamagi = sayi% 10;
        //  sayi = sayi/10;
        //  int yuzlerBasamagi = sayi;
        //  System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi);

        for (int i = sayi; i > 0; i /= 10) {
            sum = sum + i % 10;
        }
        System.out.println("Sum : " + sum);


    }
}
