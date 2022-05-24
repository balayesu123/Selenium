package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	 static WebDriver driver;
   public void chromeBrowser()
   {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
   }
   public void open_Url(String s)
   { 
	   chromeBrowser();
	   driver.get(s);
   }
   public void maximize()
   {
	   driver.manage().window().maximize();
   }
   
   public void click(String s)
   {
	   driver.findElement(By.xpath(s)).click();
   }
   public void naukri()
   {
	   open_Url("https://www.naukri.com/");
   }
   public void open_Flipcart()
   {
	  open_Url("https://www.flipkart.com/");
	  click("//button[text()='✕']");
   }
   public void open_Amazon()
   {
	  open_Url("https://www.amazon.in/"); 
   }
   public void actiTime_Login()
   {
	   open_Url("https://demo.actitime.com/login.do");
   }
   public void orangeHrm_Login()
   {
	   open_Url("https://opensource-demo.orangehrmlive.com/");
   }
   public void open_Zomato()
   {
	   open_Url("https://www.zomato.com/");
   }
  
}
