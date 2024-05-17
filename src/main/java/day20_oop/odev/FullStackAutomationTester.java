package day20_oop.odev;

public class FullStackAutomationTester extends Programs {

    public FullStackAutomationTester() {

        super(1);
        System.out.println("Full Stack Automation Tester");
    } public FullStackAutomationTester(String tester) {

        this();
        System.out.println("Software Development Engineer in Test");
    }

    @Override
    public void email() {
        System.out.println("tester@gmail.com");
    }
}
