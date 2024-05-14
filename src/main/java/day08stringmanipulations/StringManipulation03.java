package day08stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {
        //  Ornek 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //  yusuf ==> ysf

        //indexOf("u")==> 1
        //lastIndexOf("u")==> 3

        //indexOf("y")==> 0
        //lastIndexOf("y")==>0

        String s = "yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }
        System.out.println();
        System.out.println("---------------------");

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //          1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNo = "1234 6789 1234 6789";
        String first = cardNo.substring(0, 14).replaceAll("[0-9]", "*");
        String last = cardNo.substring(14);
        String result = first + last;
        System.out.println(result);

        String result2 = first.concat(last);


    }
}
