package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//SIGN-UP
	
	@FindBy(className="my-2")
	WebElement signin; 
	
	@FindBy(linkText="Sign up")
	WebElement signup;
	
	@FindBy(css="input[placeholder='First Name']")
	WebElement FName;
	
	@FindBy(css="input[placeholder='Last Name']")
	WebElement LName;
	
	@FindBy(css="input[placeholder='Enter Email']")
	WebElement email;
	
	@FindBy(css="input[placeholder='Password']")
	WebElement password;
	
	@FindBy(css="input[type='date']")
	WebElement DOB;
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div[3]/div[4]/input")
	WebElement gender;
	
	@FindBy(css="input[placeholder='91XXXXXXXXXX']")
	WebElement mobile;
	
	@FindBy(css="textarea[placeholder='Short Bio']")
	WebElement BIO;
	
	@FindBy(css="button[type='submit']")
	WebElement register;
	
	
	
	//SIGN-IN
	
		@FindBy(css="button[type='submit']")
		WebElement signIn;
		
		@FindBy(id="username")
		WebElement userName;
		
		@FindBy(id="password")
		WebElement passwordEle;
		
		@FindBy(className="btn-block")
		WebElement submit;
		
		
		
	
//ALL MOBILES	
	@FindBy(linkText="All Mobiles")
	WebElement Allmobiles ;
	
	@FindBy(css="input[placeholder='Search your Mobile name here']")
	WebElement Search;
	
	@FindBy(linkText="All Mobiles")
	WebElement allmobiles ;
	
	@FindBy(css="input[placeholder='Search your Mobile name here']")
	WebElement search;
	
	@FindBy(linkText="All Mobiles")
	WebElement AllMobiles ;
	
	@FindBy(css="input[placeholder='Search your Mobile name here']")
	WebElement SERCH;
	
	
	
	
	
	
	
	public void signupApplication(String fname,String lname,String mail,String pswd,String dob,String mob,String bio) throws InterruptedException
    {
        signin.click();
        Thread.sleep(1000);
        signup.click();
        Thread.sleep(1000);
        FName.sendKeys(fname);
        Thread.sleep(1000);
        LName.sendKeys(lname);
        Thread.sleep(1000);
        email.sendKeys(mail);
        Thread.sleep(1000);
        password.sendKeys(pswd);
        Thread.sleep(1000);
        DOB.sendKeys(dob);
        Thread.sleep(1000);
        gender.click();
        Thread.sleep(1000);
        mobile.sendKeys(mob);
        Thread.sleep(1000);
        BIO.sendKeys(bio);
        Thread.sleep(1000);
        register.click();
    }
	
	
	public void signinApplication(String username, String pswd) throws InterruptedException
    {
        signIn.click();
        userName.sendKeys(username);
        Thread.sleep(1000);
        passwordEle.sendKeys(pswd);
        Thread.sleep(1000);
        submit.click();
    }
	
	
	
	public void allMobiles(String val1,String val2, String val3) throws InterruptedException
    {
		 Allmobiles.click();
		 Search.sendKeys(val1);
         Thread.sleep(1000);
         allmobiles.click();
         search.sendKeys(val2);
         Thread.sleep(1000);
         AllMobiles.click();
         SERCH.sendKeys(val3);
         Thread.sleep(1000);
        
    }

	
	
	public void goTo() {
		// TODO Auto-generated method stub
		 driver.get("https://mobileworld.banyanpro.com/");
		
	}
	
	
	
	

}
