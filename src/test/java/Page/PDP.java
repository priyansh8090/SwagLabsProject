package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Base;

public class PDP extends Base {

	public void user_click_the_sort_za() {
		WebElement Dropdown = driver.findElement(By.cssSelector(".product_sort_container"));
		Select s = new Select(Dropdown);
		s.selectByValue("lohi");
	}

	public void user_should_see_the_za_sorted_products() {

		WebElement za = driver.findElement(By.xpath("//div[@class='app_logo']"));
		za.getText();

	}

	public void click_the_1st_product() throws InterruptedException {
		WebElement add1 = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		Thread.sleep(2000);
		add1.click();
	}

	public void click_the_2nd_product() throws InterruptedException {
		WebElement add2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		Thread.sleep(2000);
		add2.click();
	}
	
	
	public void user_click_the_basket() throws InterruptedException {
	WebElement basket =	driver.findElement(By.cssSelector(".shopping_cart_badge"));
	Thread.sleep(2000);
	basket.click();
	    
	}
	
	public void user_click_the_remove_button() throws InterruptedException {
		WebElement remove=driver.findElement(By.cssSelector("#remove-sauce-labs-onesie"));
		Thread.sleep(2000);
		remove.click();
	    
	}
	
	public void user_click_continue_button() throws InterruptedException {
		WebElement con =driver.findElement(By.cssSelector("#continue-shopping"));
		Thread.sleep(2000);
		con.click();
		driver.close();
	    
	}

}
