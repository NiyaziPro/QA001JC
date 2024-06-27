package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        //2) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));
        beseBolunen(mylist);

    }
    public static void beseBolunen( List<Integer> mylist ){
        mylist.stream().
                filter(Utils::isNumberDivisibleFive).
                forEach(Utils::printObject);
    }
}
