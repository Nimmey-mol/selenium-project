package frameassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HYR_tutorial {
	ChromeDriver driver;
	String base_url="https://www.hyrtutorials.com/p/frames-practice.html";
	@BeforeTest
	public void envsetup() {
		driver.get(base_url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void dropdownhandling() {
		driver.findElement(By.name("dropdowns")).sendKeys("java");
	}

}
