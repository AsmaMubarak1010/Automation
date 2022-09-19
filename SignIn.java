package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
@Test
	public void test1() throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("asmamubarak@gmail.com");
		driver.findElement(By.id("password")).sendKeys("as12!@");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-block")).click();
		Thread.sleep(2000);
			}

}

	