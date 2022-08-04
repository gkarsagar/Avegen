package togetherforher;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.togetherforher.com/");
			
			WebElement ForProviders= driver.findElement(By.xpath("(//a[text()='For Providers'])[1]"));
			ForProviders.click();
			WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
			Login.click();
			WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			Email.sendKeys("8668548805");
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
			password.sendKeys("sa1234");
			WebElement Signin = driver.findElement(By.xpath("//button[@id='sign-in-btn']"));
			Signin.click();
			
			
	}

}
