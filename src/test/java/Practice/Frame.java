package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
//Frame 
		driver.switchTo().frame("Login page");
		Thread.sleep(2000);
		
	WebElement login =	driver.findElement(By.xpath(""));
	login.click();
	
	driver.switchTo().defaultContent();
		
		
	}

}
