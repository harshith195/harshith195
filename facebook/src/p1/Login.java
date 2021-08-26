package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Login {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("harshiths76@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("harshith@9686");;
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		
	}
}	