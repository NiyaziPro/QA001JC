package day13arrayArraylist;

public class Arrays04 {
    public static void main(String[] args) {

        //Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burdan"}};
        // System.out.println(students[0].length);
        // System.out.println(students[1].length);
        // System.out.println(students[2].length);
        // System.out.println(students[3].length);
        int sum = 0;
        for (String[] w : students) {
            System.out.println(w.length);
            sum += w.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("-----------------------");

        //Ornek 2: Yukaridaki students Array'inde icinde "n" olan isimleri console'a yazdiriniz

        for (String [] a:students){
            for (String b :a){
                if (b.contains("n")){
                    System.out.println(b);
                }
            }
        }

    }
}
