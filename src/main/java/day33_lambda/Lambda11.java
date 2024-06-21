package day33_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda11 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Yusuf");
        mylist.add("arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("hasan");
        mylist.add("Hüseyin");

        buyukHarfHaric(mylist);
        sadeceKucuk(mylist);

    }/*
verilen listedeki ifadelerden buyuk harf iceren kelimeler disindakileri yazdırın
 */
    public static void buyukHarfHaric(List<String> mylist){

        mylist.stream().
                distinct().
                filter(t->t.replaceAll("[A-Z]","").isBlank()).
                forEach(System.out::println);
    }
    public static void sadeceKucuk(List<String> mylist){

        mylist.stream().distinct()
                .filter(t -> t.equals(t.toLowerCase()))
                .forEach(System.out::println);
    }
}
