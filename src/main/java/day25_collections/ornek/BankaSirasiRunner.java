package day25_collections.ornek;

import java.util.LinkedList;
import java.util.Queue;

public class BankaSirasiRunner {
    public static void main(String[] args) {
        BankaSirasi insan1 = new BankaSirasi("Ali");
        BankaSirasi insan2 = new BankaSirasi("Veli");
        BankaSirasi insan3 = new BankaSirasi("Huseyin");

        Queue<BankaSirasi> bankaSirasiQueue = new LinkedList<>();
        bankaSirasiQueue.add(insan1);
        bankaSirasiQueue.add(insan2);
        bankaSirasiQueue.add(insan3);
        System.out.println(bankaSirasiQueue);

        long sayac = 100;
        for (BankaSirasi each : bankaSirasiQueue) {
            System.out.println("Sira " + sayac + ".kisidedir. Lutfen 1.nolu musteri temsilcisine gidiniz");
            if (each.sira == 102) {
                System.out.println(each.name + " bey lutfen 1. nolu musteri temsilcisine gidiniz");
            }
            sayac++;
        }
    }
}
