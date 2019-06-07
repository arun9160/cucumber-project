package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class theReg_Stepdefination {
	
	WebDriver driver;
	@Given("^User is in reg page$")
	public void user_is_in_reg_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arun\\eclipse-workspace\\DemoStudentReg\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://demo.stqatools.com/");
		
		
	}

	@When("^title of the page is Demo web$")
	public void title_of_the_page_is_Demo_web() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Demo Web", title);
	    Thread.sleep(20000);
	}

	@Then("^user entyers the details$")
	public void user_entyers_the_details()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name ='studentname']")).sendKeys("Arun");
		    
		    driver.findElement(By.xpath("//input[@name ='fathername']")).sendKeys("Sekhar");
		    
		    driver.findElement(By.xpath("//input[@name ='paddress']")).sendKeys("Pulivendula");
		    
		    driver.findElement(By.xpath("//input[@name ='personaladdress']")).sendKeys("Hyderabad");
		    
		    driver.findElement(By.xpath("//input[@name ='sex' and @value = 'male']")).click();
		    
		   
		    Select select = new Select(driver.findElement(By.name("City")));
		    select.selectByValue("Mumbai");
		    
		    Select Course = new Select(driver.findElement(By.name("Course")));
		    Course.selectByValue("B.Tech");
		    
		    Select District = new Select(driver.findElement(By.name("District")));
		    District.selectByValue("Nalanda");
		    
		    Select State = new Select(driver.findElement(By.name("State")));
		    State.selectByValue("Mumbai");
		    
		    driver.findElement(By.xpath("//input[@name ='pincode']")).sendKeys("516390");
		    
		    driver.findElement(By.xpath("//input[@name ='emailid']")).sendKeys("arun.mec99@gmail.com");
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
	}

	@Then("^user is submited the form$")
	public void user_is_submited_the_form() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}


}
