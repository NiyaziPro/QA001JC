package day12arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int [] notlar = new int[5];
        System.out.println(Arrays.toString(notlar));

        //ornek: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer [] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));



    }
}
