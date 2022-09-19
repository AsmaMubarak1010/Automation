package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         LandingPage lp2 = new LandingPage(driver);
         lp2.goTo();
         Thread.sleep(1000);
         lp2.signupApplication("asma","mubarak","asmamubarak@gmail.com","as12!@" ,"10/02/2000","9876543210","good web application");
       

	}

}
