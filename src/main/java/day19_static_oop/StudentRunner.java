package day19_static_oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Veli Can";
        System.out.println(Student.sayac);
        System.out.println(student.name);

        Student student1 = new Student();
        System.out.println(Student.sayac);
        System.out.println(student.name);

        Student student0 = new Student();
        student0.name = "Veli Can";

        //1000//157
        //System.out.println(student.name);//Veli Can
        System.out.println(student0.ogrenciNo);//1000

        Student student2 = new Student();
        //System.out.println(student1.name);//Ali Can
        System.out.println(Student.sayac);//1002//157
        System.out.println(Student.sayac);
        System.out.println(student1.ogrenciNo);//1001
        System.out.println();


        System.out.println(Student.tahtaBilgisi);
        Student.tahtayiSil();
        System.out.println(Student.tahtaBilgisi);

        student0.saciniBoya();
        System.out.println(student0.name + " Sac rengi : "+student0.sacRengi);

    }
}
