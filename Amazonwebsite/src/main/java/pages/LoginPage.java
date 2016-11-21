package pages;

import org.openqa.selenium.By;


public class LoginPage extends WebDriverFactory {
	
	  public void SignIn() throws InterruptedException{
		  
		  getDriver().findElement(By.xpath(".//*[@id='nav-signin-tooltip']/a/span")).click();
		  getDriver().findElement(By.xpath(".//input[@id='ap_email'][@name='email']")).sendKeys("VamsiTuamti");
		  getDriver().findElement(By.xpath(".//input[@id='ap_password'][@name='password']")).sendKeys("654321");
		  getDriver().findElement(By.xpath(".//input[@id='signInSubmit'][@type='submit']"));
	  }
	  
		//@parmesh
	  public void login() {
	    	getDriver().findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
			getDriver().findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("kpr544");
			getDriver().findElement(By.id("ap_password")).sendKeys("123456");
			getDriver().findElement(By.id("signInSubmit")).click();
	    }	    
//@Ankamma
	  
	  public void loginpage()
	  {
		  getDriver().findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		  getDriver().findElement(By.id("ap_email")).sendKeys("ankamma");
		  getDriver().findElement(By.id("ap_password")).sendKeys("123456");
		  getDriver().findElement(By.id("signInSubmit")).click();
	  }
	  
	  //@vinod
	  public void invalidLoginPage_vinod() {
	    	getDriver().findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
			getDriver().findElement(By.id("ap_email")).sendKeys("vinod");
			getDriver().findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("MLOVE.ucm");
			getDriver().findElement(By.id("signInSubmit")).click();
	    }	    
	  
}
