package testng.bacicoftestng;

import org.testng.annotations.*;

public class AnnotationExample {
    @BeforeTest
    public void beforeTestDemo()
    {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTestDemo()
    {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClassExample()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassExample()
    {
        System.out.println("After Class");
    }
    @BeforeMethod
    public void preRequisite()
    {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void postRequisite()
    {
        System.out.println("After Method");
    }
    @Test
    public void verifyGoogle()
    {
       System.out.println("This is Google");
    }
    @Test
    public void verifAmazon()
    {
        System.out.println("This is Amazon");
    }
    @Test
    public void verifYouTube()
    {
        System.out.println("This is You Tube");
    }
}
