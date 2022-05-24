package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Search {
  public static void main(String[] args) throws Throwable {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("star");
	Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));	
    Thread.sleep(3000);
	for(WebElement i:ele)
     {
    	 String s=i.getText();
    	 System.out.println(s);
    }
  }
}
