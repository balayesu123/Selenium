package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart_Allproducts 
{
	  public static void main(String[] args)
	  {
	 	WebDriverManager.chromedriver().setup();
	 	WebDriver driver =new ChromeDriver();
	 	driver.get("https://www.flipkart.com/");
	 	driver.findElement(By.xpath("//button[text()='✕']")).click();
	 	List<WebElement> ele=driver.findElements(By.xpath("//span"));
	 	for(WebElement i:ele)
	 	{
	 		String s=i.getText();
	 		System.out.println(s);
	 	}
	  }
}
