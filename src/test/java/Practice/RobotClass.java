package Practice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Actions act = new Actions(driver);
		
		Robot r = new Robot();
		WebElement paragraph =driver.findElement(By.xpath(""));
		
	 act.doubleClick(paragraph).perform();
	 act.contextClick(paragraph).perform();
	 
	 
		
		
		
		
	}

}
