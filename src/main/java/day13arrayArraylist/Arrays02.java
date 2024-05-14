package day13arrayArraylist;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int []a={1,2,3,4,5,6,7,8,9};
        int []b={10,11,12,13,14};

        int [][]arrays={a,b};

        System.out.println(arrays[1][3]);
        System.out.println(Arrays.deepToString(arrays)); // [[1, 2, 3, 4, 5, 6, 7, 8, 9], [10, 11, 12, 13, 14]]

        for (int []w : arrays){
            for (int e : w){
                System.out.print(e+ " ");
            }
            System.out.println();
        }


    }
}
