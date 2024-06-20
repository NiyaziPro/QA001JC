package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {
        //Ornek : bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun(Structured)
        //Ornek : bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun(Functinol)

        List<Integer> mylist=new ArrayList<>(Arrays.asList(12,34,53,67,7,9,4,1,15,30,105,55));

        beseBolunen1(mylist);
        System.out.println();
        beseBolunen2(mylist);



    }
    public static void beseBolunen1 (List<Integer> mylist){
        for (Integer w : mylist) {
            if (w % 5 == 0) {
                System.out.print(w + " ");
            }
        }
    }
    public static void beseBolunen2(List<Integer> mylist) {

        mylist.stream().filter(t -> t % 5 == 0).forEach(t-> System.out.print(t+" "));
    }
}
