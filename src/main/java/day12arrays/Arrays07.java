package day12arrays;

import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        //Ornek 3: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //        [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] yeniArr = new int[arr.length];
        int ilkIndex = 0;
        for (int i : arr) {
            if (i != 0) {
                yeniArr[ilkIndex] = i;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));



    }
}
