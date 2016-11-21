package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class VerifyPage {
	//Vamsi
			@Test
			public void signinVerification() throws InterruptedException{
				LoginPage signin = new LoginPage();
				signin.intializeWebDriver();
				signin.SignIn();
				signin.tearDown();
				
			}
			//@parmesh
			@Test
			public void Loginverification(){
				
				LoginPage login = new LoginPage();
				login.intializeWebDriver();
				login.login();
				login.tearDown();
			}
			  
			  @Test
				public void loginVerification()
				{
					LoginPage login=new LoginPage();
					login.intializeWebDriver();
					login.loginpage();
					login.tearDown();
					
				}
			  
			//vinod
			  @Test
				public void loginVerification_vinod()
				{
					LoginPage login=new LoginPage();
					login.intializeWebDriver();
					login.invalidLoginPage_vinod();
					login.tearDown();
					
				}
}
