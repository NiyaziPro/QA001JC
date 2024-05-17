package day21_oop.ornek;

import day19_static_oop.InstanceBlock;

public class Runner {
    public static void main(String[] args) {

        Honda honda1 = new Honda();
        honda1.petrolTuru();
        System.out.println(honda1.model); // Honda Class'indan gelir
        System.out.println(honda1.aracTuru);// Vehicle Class'indan gelir
        System.out.println(honda1.marka);// Araba Class'indan gelir
        System.out.println(honda1.motorGucu);// Honda Class'indan gelir
        System.out.println(honda1.getRuhsatBilgisi());

        System.out.println("=============================");
        Araba araba2 = new Honda();
        /*System.out.println(araba2.marka);
        System.out.println(araba2.aracTuru);
        araba2.petrolTuru();*/

        System.out.println(araba2.marka);


      Honda honda =new Honda();



    }
}
