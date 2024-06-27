package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda12 {
    public static void main(String[] args) {
        //12) Bir List'teki karakter sayisi 7 ve 7’den cok olan tum elemanlari
        // buyuk harflerle bir listin icinde veren method'u olusturunuz.


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

        System.out.println( yedidenCokBuyuk(names));


    }
    public static List<String> yedidenCokBuyuk ( List<String> list){
        return list.stream().
                filter(Utils::isLengthGreaterThanSix).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }
}
