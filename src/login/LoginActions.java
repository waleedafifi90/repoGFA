package login;

import tests.BaseTest;

public class LoginActions{

	Login page =new  Login();

	public LoginActions typeInUserName(String username) {
		BaseTest.waitVisibilityOf(page.usernameInput);
		page.usernameInput.click();
		page.usernameInput.clear();
		page.usernameInput.sendKeys(username);
		BaseTest.driver.hideKeyboard();
		return this;
		
	}
	
	public LoginActions clickNextButton() {
		page.nextButton.click();
		return this;
	}
	
	public LoginActions typeInPassword(String password) throws InterruptedException {
		BaseTest.waitVisibilityOf(page.passwordInput);
		page.passwordInput.click();
		page.passwordInput.clear();
		page.passwordInput.sendKeys(password);
		BaseTest.driver.hideKeyboard();
		return this;
	}
	
	public LoginActions clickLoginButton() {
		page.loginButton.click();
		return this;
	}
}

