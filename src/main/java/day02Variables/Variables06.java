package day02Variables;

public class Variables06 {
    public static void main(String[] args) {
        // Ornek 1 : char data tipinde bir variable olusturunuz ve icine isminizin ilk harfini yukleyiniz.
        // Example 1: Create a variable of char data type and insert the first letter of your name into it

        char firstLetter = 'N';
        System.out.println(firstLetter);

        // Ornek 1 : boolean data tipinde, emekli mi sorusu icin bir degisken olusturun ve false atayin.
        // Example 1: Create a variable of boolean data type for the question
        // "Is he/she retired?" and assign it to false.

        boolean isRetired = false;
        System.out.println("isRetired = " + isRetired);

        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=false;
        System.out.println("-------------");
        System.out.println(b1 && b2);//f
        System.out.println(b2 || b3);//t
        System.out.println(b2 && b4);//f
        System.out.println(b3 || b4);//t


    }
}
