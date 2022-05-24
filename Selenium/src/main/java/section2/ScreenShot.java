package section2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
        File dst= new File("G:\\ScreenShot\\s1.png");
        com.google.common.io.Files.copy(src, dst);
        driver.findElement(By.id("abcdfg"));
       
        
        
        
	}
}
