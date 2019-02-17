package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTestng {
	  WebDriver driver;
	  @Test
	  public void openbrowser() {
		 driver=new ChromeDriver();
	  }
	  @Test
	  public void openurl() {
		  driver.get("http://google.com");
	  }
	  @Test
	  public void pagevalidation(){
		  Assert.assertEquals(driver.getTitle(),"Google"); 
	  }
}
