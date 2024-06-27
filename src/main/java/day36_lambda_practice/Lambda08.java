package day36_lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {
        //8)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

        List<Integer> mylist = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));

        System.out.println("maximum(mylist) = " + maximum(mylist));

    }
    public static Integer maximum ( List<Integer> mylist ){
         return mylist.stream().distinct().reduce(Math::max).get();
    }
}
