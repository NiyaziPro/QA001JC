package day07switchternarystring;

public class StringManipulations05 {
    public static void main(String[] args) {


        /*
       Meshur Regex'ler: Bir grup data'yi almak icin kullanilir
          1) Tum rakamlar ==> [0-9]
          2) Tum kucuk harfler ==> [a-z]
          3) Tum buyuk harfler ==> [A-Z]
          4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
          5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
          6) Tum noktalama isaretleri ==> \\p {Punct}
          7) Tum sesli harfler ==> [aeiouAEIOU]
             Tum a, x, y harfleri ==> [axy]
       	 a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
          8) Tum kucuk harfler haric: ==> [^a-z]
          9) Tum harfler haric ==> [^a-zA-Z]
       Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
          Sadece space karakteri : \\s
          Space karakteri haric  : \\S
          Sadece rakamlar        : \\d (digit ten geliyor)
          Rakamlar haric         : \\D
*/

        //Ornek 3: s String’indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz

        String s = "Learn Java earn 12345 money";
        // String s1 = s.replace("1234", "*");
        String s2 = s.replaceAll("[0-9]", "*");//
        System.out.println(s2);

        //Ornek 4: "s" String'indeki rakam sayisini bulunuz

        // rakamlar haric tum herseyi silerek rakam sayisina ulasabiliriz

        int num = s.replaceAll("[^0-9]", "").length();
        System.out.println(num);

    }
}
