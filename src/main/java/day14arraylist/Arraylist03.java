package day14arraylist;

import java.util.ArrayList;

public class Arraylist03 {
    public static void main(String[] args) {


        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //          [J, a, v, a, v] ==> [J, a, v]


        ArrayList<Character> arr = new ArrayList<>();
        arr.add('J');
        arr.add('a');
        arr.add('v');
        arr.add('a');
        arr.add('n');

        System.out.println(arr);

        ArrayList<Character> newArr = new ArrayList<>();

        for (Character c : arr) {
            if (!newArr.contains(c)) {
                newArr.add(c);
            }

        }
        System.out.println(newArr); // [J, a, v]


    }
}
