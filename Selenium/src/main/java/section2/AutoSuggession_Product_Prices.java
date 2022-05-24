package section2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggession_Product_Prices {
  public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
	ele1.sendKeys("iphone");
	ele1.submit();
	Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	Thread.sleep(3000);
	for(WebElement i:ele)
	{
		String s=i.getText();
		System.out.println(s);
    }
}
}
