package testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures/Order.feature"},
		glue= {"stepdefinitions"},
		plugin = {"pretty", "summary"}
		)


public class OrderTest {

}
