package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox_Handling {
  public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='Assign Leave']")).click();
	WebElement ele=driver.findElement(By.id("assignleave_txtLeaveType"));
	ele.click();
	//ele.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	//driver.findElement(By.xpath("//option[text()='CAN - Vacation']")).click();
	Select s=new Select(ele);
	 s.selectByIndex(5);
	//s.selectByValue("6");
	//s.selectByVisibleText("CAN - Vacation");
	
	
}
}
