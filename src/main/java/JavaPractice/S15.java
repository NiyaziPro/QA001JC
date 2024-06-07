package JavaPractice;

import java.util.Arrays;

public class S15 {
    public static void main(String[] args) {
        //        Find the middle element in an integer array Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        //        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int[] numbers = {12, 5, 8, 14, 22, 56};
        int[] numbers2 = {12, 5, 8, 14, 22, 15, 60, 43, 7};


        findMiddleElement(numbers);
        findMiddleElement(numbers2);


    }

    public static void findMiddleElement(int[] numbers) {

        if (numbers.length % 2 == 0) {
            Arrays.sort(numbers);
            int ortancaSayi = numbers.length / 2;
            int toplam = numbers[ortancaSayi - 1] + numbers[ortancaSayi];
            System.out.println(toplam / 2);
        } else {
            Arrays.sort(numbers);
            int ortancaSayi = numbers.length / 2;
            System.out.println(numbers[ortancaSayi]);
        }
    }

    public static void findMiddleElement2(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("numbers = " + numbers); //[I@5ba23b66
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers)); //[5, 8, 12, 14, 22, 56]

        if (numbers.length % 2 != 0) {

            int middleElement = (numbers.length - 1) / 2;

            System.out.println("numbers[middleElement] = " + numbers[middleElement]); //12

        } else {

            int firstMiddle = (numbers.length / 2) - 1;
            int secondMiddle = numbers.length / 2;

            int totalValue = numbers[firstMiddle] + numbers[secondMiddle];
            System.out.println("Middle Elements = " + totalValue / 2);

        }
    }
}
