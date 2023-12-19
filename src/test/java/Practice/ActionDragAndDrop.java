package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath(""));
		WebElement Dest = driver.findElement(By.xpath(""));
	
		act.dragAndDrop(source, Dest).perform();
		Thread.sleep(2000);
		
		
		
		
	}

}
