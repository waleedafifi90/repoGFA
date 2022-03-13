package tests;

import org.junit.Test;

import login.LoginActions;
import login.LoginAssertions;

public class LoginTest extends BaseTest{
	LoginActions loginActions = new LoginActions();
	LoginAssertions loginAssertions = new LoginAssertions();
	
	@Test
	public void loginToApp() throws Throwable {
		loginActions
		.typeInUserName("tester3")
		.clickNextButton()
		.typeInPassword("123")
		.clickLoginButton(); 
		System.out.println("Login Successfully");
		loginAssertions
		.verifyDashboard();
		System.out.println("Assertion Successfully");
	}
	
	
	

}
