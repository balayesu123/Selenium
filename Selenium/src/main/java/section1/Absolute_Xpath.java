package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Absolute_Xpath {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.w3schools.com/html/");
     
     //Absolute Xpath
     
    driver.findElement(By.xpath("/html/body/div/a[4]")).click();
     
     // Relative Xpath
     
    // driver.findElement(By.xpath("//a[@id=\"navbtn_exercises\"]")).click();

	}

}
