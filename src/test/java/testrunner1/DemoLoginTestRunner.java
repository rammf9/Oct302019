package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ramanjaneyulu.aki\\Selenium3Plus\\CucumberJenkinsProject\\src\\test"
	,glue={"stepdefs1"
	},plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
   		 monochrome = true )
public class DemoLoginTestRunner {

}
