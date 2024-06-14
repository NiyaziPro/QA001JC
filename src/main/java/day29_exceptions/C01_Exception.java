package day29_exceptions;


import java.util.InputMismatchException;

public class C01_Exception {
    // bir kutuphaneye nasil Exception eklenir
    // biz nasil exception firlatiyor idik
    // throw new
    public static void main(String[] args) {


        printAge(5);
        printAge(-3);
    }

    private static void printAge(int i)  {
        if(i>0){
            System.out.println(i);
        }else {
            throw new AgeException ("Yas degeri negatif olamaz.");
        }
    }
}
