package testng.bacicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFirstExample {
        public static WebDriver driver;
        @BeforeMethod
        public  void setUp()
        {
                 driver =new ChromeDriver();
        }
        @AfterMethod
        public void CloseBrowser()
        {
                driver.close();
        }
        @Test(groups = "smoke")
        public void verifYouTube()
        {

                driver.get("https://www.youtube.com/watch?v=4ajlOYVPxpE");
                driver.manage().window().maximize();
        }
        @Test
        public void verifCapgemini()
        {

                driver.get("https://www.capgemini.com/");
                driver.manage().window().maximize();
        }
        @Test
        public void verifTcs()
        {

                driver.get("https://www.tcs.com/");
                driver.manage().window().maximize();

        }



}
