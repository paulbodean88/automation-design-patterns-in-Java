package main.srp.testCaseExample;

public class Tester {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void executeByUser(TestCaseAfter tetCase) {
        System.out.println("Test case will be exec by " + this.getName() + "" + tetCase);
    }


}
