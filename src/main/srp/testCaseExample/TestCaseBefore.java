package main.srp.testCaseExample;

public class TestCaseBefore {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    private int id;
    private String name;
    private String summary;
    private String description;
    private String creator;
//    other test case details can be added

    public void executeForTestPlan(int testPlanId) {
        System.out.println("Test case executed in test plan " + testPlanId);

    }

    public void executeByUser(String userName) {
        System.out.println("Test case will be exec by " + userName);
    }
}
