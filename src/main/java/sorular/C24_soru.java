package sorular;

import java.util.Arrays;

public class C24_soru {
    public static void main(String[] args) {

        //        Find the smallest positive element and greatest negative element in an integer array
        //        Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int[] arr = {-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        int min = arr[arr.length - 1];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                min = Math.min(min, arr[i]);
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        int numbers[] = {-12, 18, -5, 23, -2};
        int negative = 0;
        int pozitive = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negative = numbers[i];
                if (numbers[i] > negative) {
                    negative = numbers[i];
                }


            }
            if (numbers[i] > 0) {
                pozitive = numbers[i];
                if (numbers[i] < pozitive) {
                    pozitive = numbers[i];
                }

            }


        }
        System.out.println(pozitive + " " + negative);
    }
}




