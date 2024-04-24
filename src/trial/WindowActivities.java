package trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	public static void main(String[] args) throws InterruptedException {
		
		//invoking Chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:/Users/shukl/browserdrivers/Chrome/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://google.com");
		 Thread.sleep(5000);
		 driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 Thread.sleep(5000);		 
		 System.out.println("The functionalities got checked");
		 driver.quit();
		 
		 
		 
	}

}
