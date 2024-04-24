package trial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	public static String LocatorsPractice = "https://rahulshettyacademy.com/locatorspractice/";
	public static String mvnUrl = "https://mvnrepository.com/";
	public static String rshettyUrl = "https://rahulshettyacademy.com/";
	public static String Automation_Practice = "https://rahulshettyacademy.com/AutomationPractice/";
	public static String QAclickJet= "https://rahulshettyacademy.com/dropdownsPractise/";
	
	
	static void LogPassStep (String step) {
		System.out.println(step+" : value entered in fields");
	}
	static void LogFailStep (String step) {
		System.err.println(step+" : value entered in fields");
	}
	
	public static void ClickByXpath(WebDriver driver, String URL, String xpath) {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(By.xpath(xpath)).click();
	}




}
