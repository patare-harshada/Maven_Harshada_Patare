package selenium;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TakeAScreenshotExample2 {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=4ajlOYVPxpE");
        driver.manage().window().maximize();
        File f=( (TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File desc=new File("C:\\Users\\patar\\OneDrive\\Pictures\\Saved Pictures_"
                +timeStamp()+".png");
        FileUtils.copyFile(f,desc);
        driver.close();
    }
    public static String timeStamp()
    {
        return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
    }
}
