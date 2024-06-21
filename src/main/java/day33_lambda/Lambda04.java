package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(Arrays.asList("Ali","Veli","Emre","Mehmet","Eren"));

        eHaric(myList);
        System.out.println();
        eDahil(myList);


    }

    //ornek 9: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.
    public static void eHaric(List<String> myList){
        // E ile baslamayanlari yazdirma methodu
        myList.stream().filter(t->!t.startsWith("E")).forEach(System.out::println);
    }

    public static void eDahil(List<String> myList){

        // E ile baslayanlari yazdirma methodu
        myList.stream().filter(t->t.startsWith("E")).forEach(t-> System.out.print(t+" "));
    }


}
