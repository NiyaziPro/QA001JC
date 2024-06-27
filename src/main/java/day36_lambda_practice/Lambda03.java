package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        //3) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));
        ondanKucukKare(mylist);


    }
    public static void ondanKucukKare( List<Integer> mylist){
        mylist.stream().
                filter(Utils::isNumberSmallerThanTen).
                map(Utils::squaringANumber).
                forEach(Utils::printObject);
    }

}
