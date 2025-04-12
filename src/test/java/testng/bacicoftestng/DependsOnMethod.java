package testng.bacicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test

    public void verifyLogin()
    {
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "verifyLogin")
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
