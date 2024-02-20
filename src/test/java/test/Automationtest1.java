package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutomationAmazon;

public class Automationtest1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
	}
@Test
public void login()throws Exception
{
	AutomationAmazon ob=new AutomationAmazon(driver);
	ob.pageclick();
	ob.Createaccountclick();
	ob.Customeradressclick();
ob.title();
}
}

