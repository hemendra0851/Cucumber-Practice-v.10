package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {

	WebDriver driver;
	
	@Given("^Open Chrome and launch Facebook$")
	public void Open_Chrome_and_launch_Facebook(){
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	@When("^Enter the \"(.*)\" and \"(.*)\"$")
	public void Enter_the_Username_and_Password(String username,  String password){
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Then("^Reset the values$")
	public void Reset_the_values(){
		
		driver.navigate().refresh();
		driver.close();
	}
}
