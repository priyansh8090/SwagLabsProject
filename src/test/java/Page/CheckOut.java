package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;

public class CheckOut extends Base {
	
	
	
	public void click_the_checkout() throws InterruptedException {

WebElement Checkout =driver.findElement(By.xpath("//button[@id = 'checkout']"));
		Checkout.click();
		Thread.sleep(5000);
	    
	}

	public void click_the_firstname_and_lastname_and_zipcode() throws InterruptedException {
		WebElement FirstName  =driver.findElement(By.cssSelector("#first-name"));
		FirstName.sendKeys("Priyansh");
		Thread.sleep(1000);
		WebElement LastName  =driver.findElement(By.cssSelector("#last-name"));
		LastName.sendKeys("saxena");
		Thread.sleep(1000);
		WebElement ZipCode  =driver.findElement(By.cssSelector("#postal-code"));
		ZipCode.sendKeys("242001");
		Thread.sleep(1000);
		driver.close();

	    
	}

	public void click_the_finish_button() {
		
		WebElement Finish =driver.findElement(By.xpath("//button[@id='finish']"));
		Finish.click();
		
	   
	}

}

