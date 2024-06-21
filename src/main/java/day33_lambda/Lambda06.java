package day33_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");




        List<String> yeniList = buyukHarfYap(mylist);
        System.out.println(yeniList); // [NIYAZI, HÜSEYIN]


    }
    //ornek 11: Bir List'teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> buyukHarfYap(List<String> mylist) {
        //collect(Collectors.toList()) - Java'nın Stream API'sindeki bir işlemdir.
        // Bu işlem, bir stream'de işlenmiş olan elemanları bir listeye toplar.
        return mylist.stream().
                distinct().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }
}
