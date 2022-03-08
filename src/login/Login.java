package login;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseTest;

public class Login extends BaseTest{

	@AndroidFindBy(id = "et_username")
	 protected MobileElement usernameInput;
	
	@AndroidFindBy(id = "btn_next")
	 protected MobileElement nextButton;
	

	@AndroidFindBy(id = "et_password")
	 protected MobileElement passwordInput;
	 
	@AndroidFindBy(id = "btn_login")
	 protected MobileElement loginButton;
	
	@AndroidFindBy(xpath = "//*[contains(@text, 'OPEN REQUESTS')]")
	protected MobileElement dashboardText;
}

