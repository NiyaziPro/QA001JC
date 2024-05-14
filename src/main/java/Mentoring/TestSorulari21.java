package Mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class TestSorulari21 {
    String studentName;
    String year = "2020";
    static int counter = 1000;
    String studentId;
    public TestSorulari21() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next();
        setStudentId();
    }
    public static void main(String[] args) {
        TestSorulari21 student1 = new TestSorulari21();
        System.out.println(student1.studentName + student1.studentId); //A
        TestSorulari21 student2 = new TestSorulari21();
        System.out.println(student2.studentName + student2.studentId); //B
    }
    public void setStudentId() {
        counter++;
        this.studentId = year + "" + counter;
    }



}
