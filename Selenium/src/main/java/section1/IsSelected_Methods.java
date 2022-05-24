package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsSelected_Methods extends MainClass {
 public static void main(String[] args) {
	 IsSelected_Methods s=new IsSelected_Methods();
	 s.actiTime_Login();
	 WebElement ele=driver.findElement(By.id("keepLoggedInCheckBox"));
	 ele.click();
	 String str=ele.getAttribute("title");
	 if(ele.isSelected())
	 {
		 System.out.println("check Box is Selected");
	 }
	 else
	 {
		 System.err.println("check Box is not Selected");
	 }
	 if(ele.isEnabled())
	 {
		 System.out.println("is Enabled");
	 }
	 else
	 {
		 System.err.println("is disabled");
	 }
	 if(ele.isDisplayed())
	 {
		 System.out.println("is Displayed()");
	 }
	 else
	 {
		 System.err.println("is not Displayed()");
	 }
	 System.out.println(str);
}
}
