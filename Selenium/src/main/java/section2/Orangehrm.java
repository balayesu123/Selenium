package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {
  public static void main(String[] args) throws Throwable {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Balayesu",Keys.TAB,"123",Keys.TAB,Keys.TAB,Keys.TAB,"balu");
		driver.findElement(By.id("resetBtn")).click();
}
}
