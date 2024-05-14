package day07switchternarystring;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.

        String s = "Java is easy";
        String sub1 = s.substring(0,4);
        System.out.println(sub1); // Java

        // Ornek 4: "s" String'indeki "is" kelimesini aliniz.

        String sub2 = s.substring(5,7);
        System.out.println(sub2); // is

        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz

        String sub3 = s.substring(8,12);
        System.out.println(sub3); // easy

        String sub4 = s.substring(8);
        // eger biz sadece baslangic indeksini yazarsak sonunakadar gider
        System.out.println(sub4);

        // substring(int beginIndex, int endIndex) : belirtilen indexler arasindaki degerleri saglayan bir yapi

        // substring(0,4) : "0" yani ilk index dahildir, "4" yani son index dahil degildir [0,4);



    }
}
