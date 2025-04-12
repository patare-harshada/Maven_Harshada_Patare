package testng.parameterization.parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNeedOfParameterization {
    @Test
    public void searchDataOnGoogle() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

       WebElement searchTextBox= driver.findElement(By.name("q"));
        searchTextBox.sendKeys("selenium" +"Delhi");
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.close();
    }
}
