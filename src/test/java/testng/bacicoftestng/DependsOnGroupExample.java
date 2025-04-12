package testng.bacicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = {"smoke"})
    public void verifyLogin()
    {
        Assert.assertTrue(false);
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifHomePage()
    {
        System.out.println("Verify Home page");
    }
    @Test
    public void verifOnbording()
    {
        System.out.println("Verify Onbording");
    }
}
