package testng.parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
    @Test
    public void openYouTube()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openTcs()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openInfosys()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openCapgimini()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.capgemini.com/");
        driver.manage().window().maximize();
        driver.close();

    }
}
