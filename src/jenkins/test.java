package jenkins;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

public class test {

	WebDriver driver = new ChromeDriver();
	
	@Test 
	public void StartPage(){
	System.out.println("Tesing Jenkins");
		Assert.fail();
		//System.out.println("openpage");
		//driver.navigate().to("https://google.com");
		//System.out.println("pageopened");
	}
	
	@Test 
	public void TestCase1(){
		   
		System.out.println("openpage");
		//driver.navigate().to("https://google.com");
		System.out.println("pageopened");
	}
}
