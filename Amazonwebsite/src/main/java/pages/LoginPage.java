package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LoginPage extends WebDriverFactory {
	
	  public void SignIn() throws InterruptedException{
		  
		  getDriver().findElement(By.xpath(".//*[@id='nav-signin-tooltip']/a/span")).click();
		  getDriver().findElement(By.xpath(".//input[@id='ap_email'][@name='email']")).sendKeys("VamsiTuamti");
		  getDriver().findElement(By.xpath(".//input[@id='ap_password'][@name='password']")).sendKeys("654321");
		  getDriver().findElement(By.xpath(".//input[@id='signInSubmit'][@type='submit']"));
	  }
	  public void Log() throws InterruptedException{
		  Actions action = new Actions(getDriver());
		  WebElement we = getDriver().findElement(By.xpath(".//*[@id='nav-link-accountList']"));
		  action.moveToElement(we).build().perform();
		  Thread.sleep(4000);
		  getDriver().findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		  Thread.sleep(4000);
      	  getDriver().findElement(By.cssSelector("#ap_email")).sendKeys("kishantej");
		  getDriver().findElement(By.xpath(".//input[@id='ap_password'][@name='password']")).sendKeys("8164054060");
		  getDriver().findElement(By.xpath(".//input[@id='signInSubmit'][@type='submit']"));
		
	  }
}
