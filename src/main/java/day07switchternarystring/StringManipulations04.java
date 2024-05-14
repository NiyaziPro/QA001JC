package day07switchternarystring;

public class StringManipulations04 {
    public static void main(String[] args) {
        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s = "Learn Java earn money";
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        // replace () methodu : 2.parametredeki deger 1.parametredeki degerin yerine konar.


        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz

        String s2 = s.replace("e", "");
        System.out.println(s2); // Larn Java arn mony

        // silmek istedigimiz zaman "" hiclik kullaniriz




    }
}
