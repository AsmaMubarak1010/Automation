package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllMobiles {
@Test
	public void register() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("samsung");
		Thread.sleep(2000);
		driver.close();
		
}
		
@Test
public void register2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("lenovo");
		Thread.sleep(2000);
		driver.close();
}

@Test
public void register3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("apple");
		Thread.sleep(2000);
		driver.close();
}
		
@Test
public void register4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("sa");
		Thread.sleep(2000);
		driver.close();
}

		
@Test
public void register5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("le");
		Thread.sleep(2000);
		driver.close();
}
		
@Test
public void register6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("13");
		Thread.sleep(2000);
		driver.close();
}

@Test		
public void register7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("le");
		Thread.sleep(2000);
		driver.close();
}
@Test
public void register8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");	
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("vo");
		Thread.sleep(2000);
		driver.close();
}

@Test

public void register9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile name here']")).sendKeys("ng");
		Thread.sleep(2000);
		driver.close();
}
		
		
		
		
		

	

}
