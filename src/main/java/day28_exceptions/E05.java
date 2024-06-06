package day28_exceptions;

public class E05 {
    public static void main(String[] args) {
        // try blogundan sonra birden fazla catch blogu kullanabilir miyiz?

        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(a, b, s);


    }

    private static void getCharFromString(int a, int b, String s) {
        try {
            int idx = a / b;    //1) a=12 b=3 iken idx=4 olur ve string'in 4. indexi karsımıza cıkar
            //2) a=12 b=0 iken Arithmetic exception fırlatir cunku payda 0 olur
            //3) a=12 b=1 iken idx 12 olur ve String'in 12. indexi karsımıza cıkar

            System.out.println(s.charAt(idx));
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolunemez ! "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Indekse erisilemiyor! / "+e.getMessage());
        }
    }
}
