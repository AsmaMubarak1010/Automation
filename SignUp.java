package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
@Test	

	public void register() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("my-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("asma");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("mubarak");
		driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("asmamubarak@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("as12!@");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("10/02/2000");
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
		driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("good web application");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
		
		


	}

}
