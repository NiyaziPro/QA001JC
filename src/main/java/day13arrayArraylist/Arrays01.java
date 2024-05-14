package day13arrayArraylist;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String[] arr = {"a", "b", "z", "f", "g", "e", "i"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, "b")); //  1
        System.out.println(Arrays.binarySearch(arr, "e")); //  2
        System.out.println(Arrays.binarySearch(arr, "c")); // -3

        int[] array = {2, 1, 7, 6};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array, 2));
        System.out.println(Arrays.binarySearch(array, 7));
        System.out.println(Arrays.binarySearch(array, 3));
        System.out.println(Arrays.binarySearch(array, 9));


    }
}
