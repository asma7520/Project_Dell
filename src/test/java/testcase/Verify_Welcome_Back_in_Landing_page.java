package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Welcome_Back_in_Landing_page {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();    
		driver.manage().window().maximize();
		
		//go to url
		driver.get("https://www.dell.com/en-us");
		
		//verify Logo text DellTechonologies
		
		
	String t = driver.findElement(By.xpath("//div[text()='Welcome Back']")).getText();
	
	if(t.contains("Welcome Back"))
		System.out.println("Welcome Back - logo pass" );
	else
		System.out.println("Welcome Back - logo fail");
	
		
	}

}
