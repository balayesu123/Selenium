package section2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handling {
  public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement ele=driver.findElement(By.name("q"));
	ele.sendKeys("iphone");
	ele.submit();
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
//	String mainID=driver.getWindowHandle();
//	Set<String> allID=driver.getWindowHandles();
//	for(String id:allID)
//	{
//		if(!mainID.equals(id))
//		{
//			driver.switchTo().window(id);
//		}
//	}
	
	ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(win.get(1));
	
	driver.findElement(By.className("_1KOMV2")).click();
	
}
}
