package Mentoring;

public class TestSorulari17 {
    public static void main(String[] args) {
        //String içindeki tüm küçük harfleri yıldız isaretiyle yazdırmak için gereken kodu yazınız.
        // Örnegin; 'Ali Can?' ==> l*i*a*n*
        String s = "String içindeki tüm küçük harfleri yıldız isaret!yle yazdırmak !ç!n gereken kodu yazınız. Örneg!n; 'Al! Can?' ==> l*!*a*n*";
        s = s.replaceAll("!", "i");
        System.out.println(s);

        String str = "Ali Can?";
        String str1 = str.replaceAll("[^a-z]", "");

        String c = "";
        for (int i = 0; i < str1.length(); i++) {
            String yeni = str1.substring(i,i+1);
            c = c+yeni + "*";
        }
        System.out.println(c);

        //Bir String degiskeni olusturunuz ve ilk karakteri dısındaki tüm karakterleri konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.


        String java = "Java";
        System.out.println(java.substring(1));


    }
}
