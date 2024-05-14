package day07switchternarystring;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek 6: “s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.

        String s = "Java is easy";
        Boolean isExist = s.contains("easy");
        System.out.println(isExist);
        // contains ignore case' i yok, ignore icin toLowerCase ya da toUpperCase kullanabiliriz
        // contains("buraya aradigimiz kelimeyi yazariz") icerme durumunu kontrol eder
        // contains() : methodu bir boolean deger dondurur


        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.

        Boolean isStart = s.startsWith("Java is");
        System.out.println(isStart);

        // startsWith() : methodu bir String'in ilk karakterini(lerini) kontrol eder
        // startsWith() : methodu bir boolean deger dondurur

        //Ornek 8: “s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.

        Boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);

        // endsWith() : methodu bir String'in son karakterini(lerini) kontrol eder
        // endsWith() : methodu bir boolean deger dondurur
    }
}
