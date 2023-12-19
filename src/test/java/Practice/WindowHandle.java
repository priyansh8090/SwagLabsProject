package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		WebElement txtsearch =driver.findElement(By.xpath(""));
		txtsearch.sendKeys("Hand sentizer");
		
		WebElement btnsearch =driver.findElement(By.xpath(""));
		btnsearch.click();
		
		String parentWind =driver.getWindowHandle();
		
		Set<String> allwindow =driver.getWindowHandles();
		
		for(String cd : allwindow) {
			
			if(!(parentWind.equals(cd))) {
				
				driver.switchTo().window(cd);
				
			}
			
		}
		
	WebElement btnAdd =	driver.findElement(By.id(""));
	btnAdd.click();
		
		
		
		
	}

}
