package day14arraylist;

import java.util.ArrayList;

public class Arraylist02 {
    public static void main(String[] args) {

        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(1);
        ages.add(2);
        ages.add(10);
        ages.add(25);
        ages.add(30);

        for (Integer age : ages) {
            if (age % 2 != 0) { // == kullanirsam cift sayilari 11'e donusturmus olurum
                ages.set(ages.indexOf(age), 11);
                // bir elemanin kacinci indexte oldugunu bulan bir method var : indexOf
            }

        }
        System.out.println(ages);


    }
}
