package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggesion_Handling {
   public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
	Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	Thread.sleep(3000);
	for(WebElement i:ele)
	{
		String s=i.getText();
		if(s.contains("narzo 50i"))
		{
			i.click();
		}
	}
}
}
