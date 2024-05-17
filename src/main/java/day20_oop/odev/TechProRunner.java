package day20_oop.odev;

public class TechProRunner {
    public static void main(String[] args) {
       // TechProEducation school = new TechProEducation();
        //Programs program = new Programs("Cyber Security Analyst");

        //program.email();
        //SoftwareDevelopment obj = new SoftwareDevelopment("Mobile");

        CyberSecurityAnalyst cS = new CyberSecurityAnalyst();
        cS.email();
        System.out.println("==========================================");


        FullStackAutomationTester tester = new FullStackAutomationTester("Tester");
        tester.email();
    }
}
