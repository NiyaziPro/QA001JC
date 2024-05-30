package day25.ornek;

import java.util.LinkedList;
import java.util.Queue;

public class BankamatikRunner {
    public static void main(String[] args) {
        Bankamatik b1 = new Bankamatik("Ali",1234,true);
        Bankamatik b2 = new Bankamatik("Veli",1020,false);

        Queue<Bankamatik> bankamatik = new LinkedList<>();
        bankamatik.add(b1);
        bankamatik.add(b2);
        System.out.println(bankamatik);
    }
}
