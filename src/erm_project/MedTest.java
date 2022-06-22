package erm_project;

public class MedTest {
    private String testName;
    private int testId;
    private int testIdIncrementer = 1;


    public MedTest(String testName) {
        this.testName = testName;
        this.testId = testIdIncrementer ++;
    }

    public int getTestId() {
        return testId;
    }
}
