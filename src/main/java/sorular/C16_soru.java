package sorular;

import java.util.Arrays;

public class C16_soru {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int []yeniArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }

        yeniArr[yeniArr.length-1]=9;
        System.out.println(Arrays.toString(yeniArr));








    }
}
