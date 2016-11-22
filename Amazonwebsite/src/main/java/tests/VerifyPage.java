package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class VerifyPage {
	Vamsi
			@Test
			public void signinVerification() throws InterruptedException{
				LoginPage signin = new LoginPage();
				signin.intializeWebDriver();
				signin.SignIn();
				signin.tearDown();
				
			}
//			kishan
			@Test

			public void LoginVerification() {
				LoginPage Login = new LoginPage();
				Login.intializeWebDriver();
				Login.Handler();
				Login.tearDown();
			}
			
			@Test
			public void signinVerification() {
				LoginPage signin = new LoginPage();
				signin.intializeWebDriver();
				signin.SignIn();
				signin.tearDown();
				
//>>>>>>> branch 'vamsi' of ssh://git@github.com/vamsitumati/git.git
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
			//Arun**
				@Test
				public void Accountverification() {
					LoginPage login = new LoginPage();
					login.intializeWebDriver();
					login.LogInAccount();
					login.tearDown();
				} 
}
