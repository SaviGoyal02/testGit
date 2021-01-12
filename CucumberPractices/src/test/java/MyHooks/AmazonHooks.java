package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	
	 @Before("@Smoke")
	 public void setUp_browser(Scenario sc) {
		 System.out.println("launch Browser");
		 System.out.println(sc.getName());
		 int i=9/0;
	 }
	/* 
	 @Before(order=2)
	 public void setUp_url() {
		 System.out.println("launch url");
	 }*/
	 
	 @After("@Smoke")
	 public void tearDown_close(Scenario sc) {
		 System.out.println("close the browser");
		 System.out.println(sc.getName());
	 }
	 
	/* @After(order=2)
	 public void tearDown_logout() {
		 System.out.println("logout");
	 }
	 */
	/* @BeforeStep
	 public void Screenshot() {
		 System.out.println("Take the screenshot");
	 }
	 
	 @AfterStep
	 public void refresh() {
		 System.out.println("Refresh"); 
	 }*/
}
