package JavaPractice;

import java.util.ArrayList;


public class InterviewS03_Array {
    public static void main(String[] args) {
        /**Write a code that returns the duplicate chars in a String array.(interview Question)
         //Input :
         //String str=“Javaisalsoeasy”
         //Output: [a, s] */

        String str = "Javaisalsoeasy";

        ArrayList<Character> duplicateChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j) && !duplicateChars.contains(currentChar)) {
                    duplicateChars.add(currentChar);
                    break; // Duplicate bulunduğunda iç içe döngüyü sonlandır
                }
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + duplicateChars);
/*
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        for (char c : str.toCharArray()){
            if (!arr.add(c)){
                arr2.add(c);
            }
        }
        System.out.println("Input : "+ str);
        System.out.println("Output : "+ arr2);*/


       /* ArrayList<Character> uniqueChars = new ArrayList<>();
        ArrayList<Character> duplicateChars = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            } else if (!duplicateChars.contains(c)) {
                duplicateChars.add(c);
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + duplicateChars);*/
    }
}
