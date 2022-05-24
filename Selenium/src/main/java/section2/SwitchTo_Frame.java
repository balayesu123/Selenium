package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame {
   public static void main(String[] args) throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		WebElement ele=driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		//Thread.sleep(3000);
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String s=driver.findElement(By.className("title")).getText();
		System.out.println(s);
		

}
}
