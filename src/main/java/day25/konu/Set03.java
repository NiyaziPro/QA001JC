package day25.konu;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {

        // TreeSet nasil olusturulur?
        TreeSet<Character> treeSet = new TreeSet<>();

        treeSet.add('C');
        treeSet.add('R');
        treeSet.add('G');
        treeSet.add('F');
        treeSet.add('L');
        treeSet.add('A');
        treeSet.add('O');
        treeSet.add('Q');
        // treeSet.add(null); HATA   -  NullPointerException


        System.out.println(treeSet);

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        SortedSet<Character>ss=treeSet.subSet('B','R');
        System.out.println(ss); // [C, F, G, L, O, Q]



    }
}
