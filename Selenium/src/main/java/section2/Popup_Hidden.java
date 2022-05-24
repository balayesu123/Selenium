package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Hidden {
   public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.id("container_tasks")).click();
	Thread.sleep(3000);
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='You are about to delete 76 tasks']")));
	driver.findElement(By.className("selection")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[class='delete button']")).click();
	Thread.sleep(3000);
	String s=driver.findElement(By.xpath("//span[text()='Warning: Task deletion cannot be undone.']")).getText();
	System.out.println(s);
	
}
   
}
