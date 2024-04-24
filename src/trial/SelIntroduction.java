package trial;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SelIntroduction extends CommonFunctions{
	
	public static void main(String[] args) throws InterruptedException {
		
		//invoking Chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:/Users/shukl/browserdrivers/Chrome/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		//invoking Edge browser
//		 System.setProperty("webdriver.edge.driver", "C:/Users/shukl/browserdrivers/edge/msedgedriver.exe");
//		 WebDriver driver = new EdgeDriver();
		 
			
			
		/*
		 * String username= "Rahul"; // String password= "Online123"; String password =
		 * getPassword(driver);
		 * 
		 * driver.get(LocatorsPractice); 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //
		 * Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
		 * username); LogPassStep(username); Thread.sleep(4000);
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * password); Thread.sleep(4000); LogPassStep(password);
		 * 
		 * driver.findElement(By.xpath("//button[contains (text(), 'Sign In')]")).click(
		 * ); System.out.println("SignIn Button Clicked Successfully");
		 * Thread.sleep(5000);
		 * 
		 * // String msg= driver.findElement(By.cssSelector("p.error")).getText(); //
		 * System.err.println(msg);
		 * Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(),
		 * "You are successfully logged in.");
		 * Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),
		 * "Hello "+username+",");
		 * driver.findElement(By.xpath("//button[@class='logout-btn']")).click(); //
		 * Thread.sleep(3000); // driver.close(); // Thread.sleep(6000); driver.quit();
		 * 
		 */ 
		 
		 driver.get(Automation_Practice);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 Xpath_Practice xprac = new Xpath_Practice();
		 
		 ClickByXpath(driver, Automation_Practice, xprac.GetloginButton());
		 LogPassStep("Login Button");
		 driver.quit();
		 
	}
	
//	public static void setupBrowser(String url) {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/shukl/browserdrivers/Chrome/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get(LocatorsPractice);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String txt ="//a[normalize-space()='Forgot your password?']";
		driver.findElement(By.xpath(txt)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
//		Retrieving the password
		String passArray=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String password= passArray.split("'")[1].split("'")[0];		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		return password;
	}

}
