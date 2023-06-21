package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginnStepss {
	WebDriver driver;
	@Given("The user should be in registor page")
	public void the_user_should_be_in_registor_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					   
	}

	@When("The user as to fill the checkbox")
	public void the_user_as_to_fill_the_checkbox() {

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Selvam789");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sudha789");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
//		WebElement newuser = driver.findElement(By.xpath("//a[@href='Register.php']"));
//	    newuser.click();
	}

	@When("The user as to click the login")
	public void the_user_as_to_click_the_login() {
		
		
		WebElement loc = driver.findElement(By.id("location"));
		Select r = new Select(loc);
		r.selectByValue("London");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select r1 = new Select(hotel);
		r1.selectByValue("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select r2 = new Select(roomtype);
		r2.selectByValue("Double");
		
		WebElement room = driver.findElement(By.id("room_nos"));
		Select r3 = new Select(room);
		r3.selectByValue("Four");
		
	
		
		
		
		
		
		
		
		
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("Selvam789");
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Sudha789");
//		WebElement loginbtn = driver.findElement(By.id("login"));
//		loginbtn.click();
//	    WebElement repassword = driver.findElement(By.id("re_password"));
//	    repassword.sendKeys("986579");
	}

	@Then("The user should be invalid")
	public void the_user_should_be_invalid() throws InterruptedException {
		
//		WebElement fullname = driver.findElement(By.name("full_name"));
//		fullname.sendKeys("Sudharsan");
//		WebElement emailaddress = driver.findElement(By.name("email_add"));
//		emailaddress.sendKeys("sudharsan007@gmail.com");
//		Thread.sleep(6000);
//		WebElement selectsq = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		selectsq.click();
//		WebElement regbttn = driver.findElement(By.xpath("//input[@type='submit']"));
//		regbttn.click();
//		WebElement loc = driver.findElement(By.id("location"));
//		Select r = new Select(loc);
//		r.selectByValue("London");
	   
	}

	
	
	
	
	
	
	
	
	
}
