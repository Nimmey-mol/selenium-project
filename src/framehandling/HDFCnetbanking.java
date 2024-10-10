package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HDFCnetbanking {
	WebDriver driver;
	String url="https://netbanking.hdfcbank.com/netbanking/";
	@BeforeTest
	public void envsetup() {
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void frame_test() {
		
		//driver.switchTo().frame(0);  	//switching by frame index
		//driver.switchTo().frame("login_page");     //switching by frame name or id
		WebElement frame1= driver.findElement(By.name("login_page"));   //switching by frame as webelement
		driver.switchTo().frame(frame1)	;
		driver.findElement(By.name("abcduytghj")).sendKeys("12345");
		
	}

}
