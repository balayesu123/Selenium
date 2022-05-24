package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Alert {
   public static void main(String[] args) throws Throwable {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();//a[text()='Types of Work']
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.cssSelector("span[unselectable='on']")).click();
		driver.findElement(By.id("name")).sendKeys("Balu");
		Thread.sleep(3000);
		driver.findElement(By.className("input[value='      Cancel      ']")).click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
}
}
