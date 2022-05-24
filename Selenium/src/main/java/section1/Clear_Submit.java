package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Clear_Submit extends MainClass {
	
  public static void main(String[] args) throws Throwable {
	  Clear_Submit cs=new Clear_Submit();
	  cs.open_Flipcart();
	  WebElement ele= driver.findElement(By.name("q"));
	  ele.sendKeys("samsung");
	  Thread.sleep(2000);
	  ele.clear();
	  ele.sendKeys("iphone");
	  ele.submit();
	  cs.maximize();
}
}
