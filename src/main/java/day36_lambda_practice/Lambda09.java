package day36_lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lambda09 {
    public static void main(String[] args) {
        //9)Verilen List'ten 12’den buyuk en kucuk sayiyin karesini bulmak için bir method oluşturun

        List<Integer> mylist = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9, 10,13, 20, 21, 25, 12));
        System.out.println("method(mylist) = " + method(mylist));


    }
    public static Integer method(List<Integer> mylist){
        return mylist.stream().
                distinct().
                filter(Utils::isNumberGreaterThanTwelve).
                reduce(Math::min).
                map(Utils::squaringANumber).get();
    }
}
