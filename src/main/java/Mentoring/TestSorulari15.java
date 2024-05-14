package Mentoring;

public class TestSorulari15 {
    public static void main(String[] args) {
        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örnegin; accessories ´ ces

        String t = "accessories";
        String a = "";

        for (int i = 0; i < t.length(); i++) {
            String ch = t.substring(i, i + 1);
            if (t.indexOf(ch) != t.lastIndexOf(ch)) {
                if (!a.contains(ch)) {
                    a = a + ch;
                }
            }

        }
        System.out.println(a);

        // Asagıdaki çarpım tablosunu olusturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int x = 3;
        for (int i = 1; i < 11; i++) {
            System.out.println(x + "*" + i + "=" + x * i+ "\t");
        }
    }
}