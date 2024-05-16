package sorular;

import java.util.Scanner;

public class C22_soru {

    String studentName;
    String year = "2024";
    static int counter = 1000;
    String studentId;

    public C22_soru() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next();

        setStudentId();
    }

    public static void main(String[] args) {
        C22_soru student1 = new C22_soru();
        System.out.println(student1.studentName + student1.studentId); //A
        C22_soru student2 = new C22_soru();
        System.out.println(student2.studentName + student2.studentId); //B
    }

    public void setStudentId() {
        counter++;
        this.studentId = year + "" + counter;
    }
}



