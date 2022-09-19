package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMobilesPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asma.mubarak\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LandingPage lp3 = new LandingPage(driver);
        lp3.goTo();
        Thread.sleep(1000);
        lp3.allMobiles("samsung","lenovo","apple");

	}

}
