package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPOM {
	
	public static void main(String[] args) throws InterruptedException {
		    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		Thread.sleep(1000);
		lp.signinApplication("asmamubarak@gmail.com","as12!@");
		         
		    }

}
