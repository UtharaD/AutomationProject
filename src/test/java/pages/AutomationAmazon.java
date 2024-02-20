package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationAmazon {
	WebDriver driver;
	//create account
    By signin=By.xpath("//*[@id=\"nav-link-accountList\"]");
	By CreateAccountSubmit=By.xpath("//*[@id=\"createAccountSubmit\"]");
    By customername=By.xpath("//*[@id=\"ap_customer_name\"]");
	By mobilenumber=By.xpath("//*[@id=\"ap_phone_number\"]");
    By password1=By.xpath("//*[@id=\"ap_password\"]");
    By verifymobilenumber=By.xpath("//*[@id=\"continue\"]");
	//login
   By email=By.xpath("//*[@id=\"ap_email\"]");
   By Continue=By.xpath("//*[@id=\"continue\"]");
   By password=By.xpath("//*[@id=\"ap_password\"]");
   By signinbutton=By.xpath("//*[@id=\"signInSubmit\"]");
   //product search
   By searchbox=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
   By search=By.xpath("//*[@id=\"nav-search-submit-button\"]");
   By find=By.xpath("//*[@id=\"a-autoid-3-announce\"]");
   By buy=By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a");
   By Buynow=By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
   By adress=By.xpath("//*[@id=\"address-list\"]/div/div[2]");
   By title=By.xpath("//*[@id=\"nav-logo-sprites\"]");
 public AutomationAmazon(WebDriver driver)
{
	this.driver=driver;}
public void pageclick()
{
	driver.findElement(signin).click();}

public void Createaccountclick()
{
	driver.findElement(CreateAccountSubmit).click();}
public void Customeradressclick()
{
driver.findElement(customername).sendKeys("Uthara D");
driver.findElement(mobilenumber).sendKeys("7593959488");
driver.findElement(password).sendKeys("Uthara@1234");
driver.findElement(verifymobilenumber).click();
driver.findElement(email).sendKeys("8547421196");
driver.findElement(Continue).click();
driver.findElement(password).sendKeys("Uthara@123");
driver.findElement(signinbutton).click();
driver.findElement(searchbox).sendKeys("aqualogica suscreen");
driver.findElement(search).click();
driver.findElement(find).click();
driver.findElement(buy).click();
driver.findElement(Buynow).click();
driver.findElement(adress).click();}
	

		//TITLE VERIFICATION
		public void title() throws Exception
		{
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			String expectedtitle="amazon.in";
		if(actualtitle.equals(expectedtitle))
		 {
			System.out.println("pass");
		  }
		  else
		 {
			  System.out.println("fail");
		   }
		  driver.close();

		
		//content verification
		
			String content=driver.getPageSource();
			if(content.contains("Electronics"))
			{
				System.out.println("pass");
			}
			else
		{
			System.out.println("fail");
			}

		}}
		 
	
	
	





