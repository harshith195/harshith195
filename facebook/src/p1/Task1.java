package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_aD696FACB3197C45B8392506EF");
    	driver.findElement(By.name("field-keywords")).sendKeys("poco");  
    	driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
    	driver.findElement(By.linkText("Tecno")).click();
    	driver.navigate().to("https://www.facebook.com/");
    	driver.navigate().back();
    	driver.quit();
	}
	

}
