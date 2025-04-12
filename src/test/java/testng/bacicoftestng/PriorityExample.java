package testng.bacicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failtestrun.FailedExecution;

public class PriorityExample {

    @Test(priority = 1,enabled = true, retryAnalyzer = FailedExecution.class)
    public void TestCaseZ()
    {

    }
    @Test(priority = -'a',groups = "smoke" , retryAnalyzer = FailedExecution.class)
    public void TestCaseH()
    {
        System.out.println("Test Case H");
    }
    @Test(priority = -1,description = "Verify Test case A" , retryAnalyzer = FailedExecution.class)
    public void TestCaseA()
    {
        System.out.println("Test Case A");
    }
    @Test(priority = 4,groups = "smoke" , retryAnalyzer = FailedExecution.class)
    public void TestCaseX()
    {
        System.out.println("Test Case X");
    }
    @Test( retryAnalyzer = FailedExecution.class)
    public void TestCaseM()
    {
        Assert.assertTrue(false);
        System.out.println("Test Case M");
    }
}
