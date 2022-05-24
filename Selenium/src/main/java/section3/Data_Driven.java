package section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven {
   public static void main(String[] args) throws Throwable {
	//FileInputStream fis=new FileInputStream("C:\\Users\\sivaram\\Desktop\\Datadriven\\Data.PROPERTIES");
	FileInputStream fis=new FileInputStream("C:\\Users\\sivaram\\eclipse-workspace\\Selenium\\src\\main\\java\\data\\Datadriven.PROPERTIES");
	Properties p=new Properties();
	p.load(fis);
	String un=p.getProperty("username");
	System.out.println(un);
	String psw=p.getProperty("password");
	System.out.println(psw);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(un,Keys.TAB,psw,Keys.ENTER);
}
}

