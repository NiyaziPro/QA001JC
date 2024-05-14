package day07switchternarystring;

public class StringManipulations01 {
    public static void main(String[] args) {

        // Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.

        String s = "Java is easy";
        System.out.println(s.length());
        // lenght() methodu Stringin uzunlugunu almayi saglar

        // Ornek 2: "s" String'inde ilk ve son index’teki karakterleri aliniz.

        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        // charAt () methodu Stringteki belirli indexten karakter almayi saglar


    }
}
