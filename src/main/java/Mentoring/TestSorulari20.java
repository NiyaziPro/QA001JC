package Mentoring;

public class TestSorulari20 {
    public static void main(String[] args) {
        String str = "Str!ng studentName;\n" +
                "Str!ng year = \"2020\";\n" +
                "stat!c !nt counter = 1000;\n" +
                "Str!ng studentId;\n" +
                "publ!c Test() {\n" +
                "Scanner scan = new Scanner(System.!n);\n" +
                "System.out.pr!ntln(\"Enter your name\");\n" +
                "studentName = scan.next();\n" +
                "setStudentId();\n" +
                "}\n" +
                "publ!c stat!c vo!d ma!n(Str!ng[] args) {\n" +
                "Test student1 = new Test();\n" +
                "System.out.pr!ntln(student1.studentName + student1.studentId); //A\n" +
                "Test student2 = new Test();\n" +
                "System.out.pr!ntln(student2.studentName + student2.studentId); //B\n" +
                "}\n" +
                "publ!c vo!d setStudentId() {\n" +
                "counter++;\n" +
                "th!s.studentId = year + \"\" + counter;\n" +
                "}";

        System.out.println(str.replaceAll("!", "i"));

        String str1 = "Learn";
        join("Java");
        System.out.println(str);
    }
    public static String join(String str1) {
        return str1 + "Java";
    }


}
