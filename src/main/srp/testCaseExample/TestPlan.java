package main.srp.testCaseExample;

public class TestPlan {
    private int testPlanId;

    public int getTestPlanId() {
        return testPlanId;
    }

    public void setTestPlanId(int testPlanId) {
        this.testPlanId = testPlanId;
    }

    public void executeForTestPlan(TestCaseAfter testCase) {
        System.out.println("Test case executed in test plan " + this.getTestPlanId());
    }
}
