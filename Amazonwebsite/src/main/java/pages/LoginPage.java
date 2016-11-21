package pages;

import org.openqa.selenium.By;


public class LoginPage extends WebDriverFactory {
	
	  public void SignIn() throws InterruptedException{
		  
		  getDriver().findElement(By.xpath(".//*[@id='nav-signin-tooltip']/a/span")).click();
		  getDriver().findElement(By.xpath(".//input[@id='ap_email'][@name='email']")).sendKeys("VamsiTuamti");
		  getDriver().findElement(By.xpath(".//input[@id='ap_password'][@name='password']")).sendKeys("654321");
		  getDriver().findElement(By.xpath(".//input[@id='signInSubmit'][@type='submit']"));
	  }

}
