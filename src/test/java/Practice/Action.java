package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		Actions act = new Actions(driver);
	WebElement sport = 	 driver.findElement(By.xpath(""));
		act.moveToElement(sport).perform();
		Thread.sleep(2000);
		
		WebElement waight = 	 driver.findElement(By.xpath(""));
		waight.click();
		//
		
		
	}
	
	

}
