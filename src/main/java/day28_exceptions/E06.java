package day28_exceptions;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur

        String a = null;
        //System.out.println(a.length());

       karakterSayisi(a);

        System.out.println("Kodlarimiz calismaya devam ediyor...");


    }

    public static void karakterSayisi(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println("Null degeri ile length methodunu kullanmayiniz ! / "+e.getMessage());

        }
    }
}
