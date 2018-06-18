package StepDefinition;

import java.util.Map;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;	
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "C:\\Vasi\\Softwares\\chromedriver.exe");						
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("https://www.amazon.in/");	
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[contains(@id,'nav-link-yourAccount')]")).click();
    }		

   /* @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
      		
       driver.findElement(By.id("ap_email")).sendKeys("Username");
       driver.findElement(By.id("continue")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("ap_password")).sendKeys("Password");	
    }		
*/
    @Then("^Reset the credential$")					
    public void	ClickOnSubmit() throws Throwable 							
    {		
    	driver.findElement(By.id("signInSubmit")).click();	
        driver.close();			
    }
    
   //@When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")	
   // @When ("^Enter the Username \"(\\d+)\" and Password \"(\\d+)\"$")
 //   @When("^^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$") 
    //@When("^User enters \"(.*)\" and \"(.*)\"$")
   // @When("^user enter (.*) and (.*)$") 
        @When("^User enters \"(.*)\" and \"(.*)\"$") 
    public void enter_the_Username_and_Password(String username,String password) throws Throwable {
   		//Write the code to handle Data Table
   	//	for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
   		 driver.findElement(By.id("ap_email")).sendKeys(username);
          driver.findElement(By.id("continue")).click();
          Thread.sleep(1000);
          driver.findElement(By.id("ap_password")).sendKeys(password);	
   			}

  // 	}
    
    public void enter_the_address(String username,String password) throws Throwable {
   		//Write the code to handle Data Table
   	//	for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
    	   driver.findElement(By.id("//*[contains(@id,'nav-link-yourAccount')]")).click();
    	   driver.findElement(By.id("//*[contains(text(),'Your Addresses')]")).click();
    	   driver.findElement(By.id("ya-myab-plus-address-icon")).click();
   		 driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys();
   		 driver.findElement(By.id("")).sendKeys();
          driver.findElement(By.id("")).click();
          Thread.sleep(1000);
          driver.findElement(By.id("")).sendKeys(password);	
   			}
    
  // 	}
}		