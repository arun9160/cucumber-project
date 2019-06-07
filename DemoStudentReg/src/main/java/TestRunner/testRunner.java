package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\arun\\eclipse-workspace\\DemoStudentReg\\src\\main\\java\\Features\\login.feature",
		glue = {"StepDefination"},
		  format = {
	        		"pretty",
	                "html:target/site/cucumber-pretty",
	                "rerun:target/rerun.txt",
	                "json:target/cucumber1.json" 
	        }
		
		)




public class testRunner {

}
