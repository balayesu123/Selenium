package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Url {
  public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
	String str=driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Red, 128 GB)']")).getText();
	System.out.print(str);
	Thread.sleep(3000);
	String s=driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Red, 128 GB)']/../../div[2]/div/div/div")).getText();
	System.out.println("        "+s);
}
}
