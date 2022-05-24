package section2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_popUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		WebElement ele=driver.findElement(By.id("datepicker"));
		Calendar c=Calendar.getInstance();
		c.add(c.DAY_OF_MONTH,0);
		Date d=c.getTime();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/YY");
		String dt=s.format(d);

		ele.sendKeys(dt,Keys.ESCAPE);
		System.out.println(dt);   		
	}
}
