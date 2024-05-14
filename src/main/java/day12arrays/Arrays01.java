package day12arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(arr[2]); // 5
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); // 6
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
