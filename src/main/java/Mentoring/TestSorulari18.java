package Mentoring;

public class TestSorulari18 {
    public static void main(String[] args) {

        //Verilen verilerdeki ondalık kısımdaki rakamların toplam değerini hesaplayın.

        double a = 28.587;
        System.out.println(String.valueOf(a).split("\\.")[1]);
        String b = String.valueOf(a).split("\\.")[1];

      /*  String sum = "" ;
        for (int i = 0; i < b.length(); i++) {
           String r = b.substring(i,i+1);
           sum= sum+r;
        }
        System.out.println(sum);*/

        int decimalPart = Integer.valueOf(b);
        int sum = 0;

        for (int i = decimalPart; i > 0; i /= 10) {
            /*int dP = i % 10;
            sum = sum + dP;*/
            sum = sum + i % 10;

        }
        System.out.println("sum = " + sum);


    }
}
