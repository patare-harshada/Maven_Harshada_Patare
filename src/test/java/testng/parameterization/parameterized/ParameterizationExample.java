package testng.parameterization.parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
     public WebDriver driver;
     @Parameters("BrowserName")
     @BeforeMethod
     public void setUp(String BrowserName)

     {
       if(BrowserName.equals("chrome"))
       {
           driver=new ChromeDriver();
       }else if (BrowserName.equals("firefox"))
       {
           driver=new FirefoxDriver();
       }else  if (BrowserName.equals("edge"))
       {
           driver=new EdgeDriver();
       }
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();

     }


    @Parameters({"courceName","cityName"})
    @Test
    public void searchDataOnGoogle(String courceName,String cityName) throws InterruptedException {
         WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courceName +" " + cityName );
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.close();
    }

}
