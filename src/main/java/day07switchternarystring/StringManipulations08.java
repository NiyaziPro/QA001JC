package day07switchternarystring;

public class StringManipulations08 {
    public static void main(String[] args) {
        // Practice sorular :
        /*
            Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
            karakter sayısının toplamını yazdırınız.
             */

        String isim = " Ah met Ker em ";
        String isim2 = " Ay şe Arzu ";
        String isim3 = "Meh met Al i ";

        int a = isim.replace(" ", "").length();// 10
        int b = isim2.replace(" ", "").length();// 8
        int c = isim3.replace(" ", "").length();// 9
        System.out.println(a + b + c);

        //  isim = isim.replaceAll(" ", "");
        //  isim2 = isim2.replaceAll(" ", "");
        //  isim3 = isim3.replaceAll(" ", "");

        //  System.out.println(isim.length() + isim2.length() + isim3.length());


        // Bir String değişkeni oluşturunuz
        // ve String değişkenin konsolda boşluk olmayan son
        // karakteri yazdırınız.

        String str = " J a v a b u g u  n cok g  u z e  l   ";

        // char lastChar= str.trim().charAt(str.trim().length()-1);
        // System.out.println("lastChar = " + lastChar);

        //1.yol
        System.out.println(str.trim().charAt(str.trim().length() - 1));
        //2.yol
        str = str.trim();
        System.out.println(str);
        System.out.println(str.charAt(str.length() - 1));


    }
}
