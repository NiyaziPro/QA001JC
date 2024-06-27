package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda05 {
    public static void main(String[] args) {
        //5)Bir list'teki “tekrarsiz","7'den buyuk" elemanlarin "karelerinin"
        // "toplamını" hesaplayan method oluşturun

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));

        System.out.println(yedidenBuyukKareToplam(mylist));


    }
    public static Integer yedidenBuyukKareToplam(List<Integer> mylist){
        return mylist.stream().
                distinct().
                filter(Utils::isNumberGreaterThanSeven).
                map(Utils::squaringANumber).
                reduce(Utils::sum).get();
    }
}
