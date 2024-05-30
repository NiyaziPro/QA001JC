package day25.odev;

import java.util.LinkedList;

public class KediRunner {
    public static void main(String[] args) {


        Kedi kedi1 = new Kedi("Kedi1",3,"Disi");
        Kedi kedi2 = new Kedi("Kedi2",5,"Erkek");
        Kedi kedi3 = new Kedi("Kedi3",4,"Disi");

        LinkedList<Kedi> kediHalayi = new LinkedList<>();
        kediHalayi.add(kedi1);
        kediHalayi.add(kedi2);
        kediHalayi.add(kedi3);

        System.out.println(kediHalayi);
    }
}
