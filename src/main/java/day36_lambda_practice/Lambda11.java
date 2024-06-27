package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda11 {
    public static void main(String[] args) {
        //11) Bir List'te karakter sayisi 7’den az olan tum elemanlari
        // tekrarsiz olarak console'a Buyuk harflerle yazdiran method'u olusturunuz.


        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Elif");
        names.add("Elif");
        names.add("Yusuf");
        names.add("Yusuf");
        names.add("Arda");
        names.add("Niyazi");
        names.add("Esra");
        names.add("Hasan");
        names.add("Hüseyin");
        names.add("Zeynep");
        method(names);


    }
    public static void method(List<String> list){
        list.stream().distinct().
                filter(Utils::isLengthSmallerThanSeven).
                map(String::toUpperCase).forEach(Utils::printObject);
    }
}
