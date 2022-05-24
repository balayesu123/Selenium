package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practies extends MainClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		for (WebElement text : list) 
		{
			String data=text.getText();
			if(data.contains("selenium webdriver"))
			{
				text.click();
			}
			
		}
	}
}
