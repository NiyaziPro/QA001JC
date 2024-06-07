package sorular;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class C27_soru {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar deger girmesini isteyiniz
        // ve en son girdigi degerleri bir array'e atayınız

        LinkedList<String> myList = new LinkedList<>();


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Lutfen listeye eklemek istediginiz kelimeyi giriniz \nCikmak icin Q giriniz:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")){
                break;
            }else {
                myList.add(input);
            }

        }while(true);

        String [] arr = myList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));









    }
}
