package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class VerifyPage {
	//Vamsi
//			@Test
//			public void signinVerification() throws InterruptedException{
//				LoginPage signin = new LoginPage();
//				signin.intializeWebDriver();
//				signin.SignIn();
//				signin.tearDown();
//				
//			}
			//kishan
			@Test
			public void LoginVerification() throws InterruptedException{
				LoginPage Login = new LoginPage();
				Login.intializeWebDriver();
				Login.Log();
				Login.tearDown();
			}
}
