package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Handling {
	public static void main(String[] args) throws Throwable {

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement ele=driver.findElement(By.xpath("//div[text()='Mobiles']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(3000);
	ele.click();
	//*****Mouse Rihht click*****//
	//act.moveToElement(ele).contextClick().build().perform();
}
}
