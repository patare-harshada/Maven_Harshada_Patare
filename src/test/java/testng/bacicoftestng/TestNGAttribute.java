package testng.bacicoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {
    @Test(invocationCount = 30,invocationTimeOut = 1)

public void attributeExample()
    {
       System.out.println("TestNG Attribute");
    }

}
