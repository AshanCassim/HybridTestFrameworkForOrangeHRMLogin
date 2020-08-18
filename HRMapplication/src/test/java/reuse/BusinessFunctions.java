package reuse;

import org.openqa.selenium.WebDriver;

import commands.ActionDriver;
import config.StartBrowser;
import objectrepositry.HomePage;
import objectrepositry.LoginPage;

public class BusinessFunctions {
	
	WebDriver driver;
	ActionDriver aDriver;
	
	public  BusinessFunctions() 
	{
		
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
		
	}
	
	public void login() throws Exception 
	{
		  StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to App");
		
		  aDriver.navigateToApp("https://opensource-demo.orangehrmlive.com/");
		  
		  aDriver.enterTXT(LoginPage.txtUserName,"Admin","UserName");
		  
		  aDriver.enterTXT(LoginPage.txtPasswrd,"admin123","Passwrd");
		  
		  aDriver.clickButtn(LoginPage.btnLogin,"Loginbtn");
		
		
	}
	
	public void logot() throws Exception 
	{
		  StartBrowser.childTest = StartBrowser.parentTest.createNode("Logout from App");
		
		  aDriver.clickButtn(HomePage.WelcomeAdmin,"Welcome Admin Link");
		  
		  aDriver.clickButtn(HomePage.Logoutlink,"Logout Link");
		
		
	}

}
