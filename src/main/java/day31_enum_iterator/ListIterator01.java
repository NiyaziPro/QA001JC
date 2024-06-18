package day31_enum_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {
    public static void main(String[] args) {

        //Not: ListIterator, Iterator'ın bir alt arayüzüdür ve listeler üzerinde iki yönlü dolaşmanıza ve elemanların indekslerine erişmenize olanak tanır.
        //sadece List arayüzünü uygulayan sınıflarla (örneğin ArrayList, LinkedList gibi) kullanılabilir.


        List<String> yourList = new ArrayList<>(Arrays.asList("Ali","Can","Esra", "Niyazi","Ahmet"));

        System.out.println(yourList);

        ListIterator<String> yourListItr  = yourList.listIterator();

        // 1) set () : Koleksiyonun gecerli elemanini degistirir

        while (yourListItr.hasNext()){
            String str = yourListItr.next();
            yourListItr.set(str+"*");

        }

        System.out.println(yourList);

        // 2. elemanlari sondan basa dogru yazdirin

        ListIterator<String> itr2 = yourList.listIterator();

        while(itr2.hasNext()){
            itr2.next();
        } // bu loop pointeri en saga almak icin yazildi

        while(itr2.hasPrevious()){
            System.out.print(itr2.previous()+"<--");
        }

    }
}
