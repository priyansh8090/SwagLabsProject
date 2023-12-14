package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Base;

public class Basket extends Base {

	public void user_select_the_dropdown_high_to_low() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(dropdown);

		select.selectByValue("hilo");

	}

	public void user_add_to_the_product_in_basket() throws InterruptedException {
		WebElement add3 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light "));
		add3.click();
		Thread.sleep(2000);
		WebElement add4 = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		add4.click();

	}

	public void verify_the_count_of_basket() throws InterruptedException {
		WebElement basket = driver.findElement(By.cssSelector(".shopping_cart_link"));
		Thread.sleep(2000);
		basket.click();

	}
	
	
	public void user_click_the_1st_product_details() throws InterruptedException {
		WebElement add1 = driver.findElement(By.cssSelector("a[id='item_5_title_link'] div[class='inventory_item_name ']"));
		Thread.sleep(2000);
	   add1.click();
	}

	public void user_click_the_add_to_cart_button() throws InterruptedException {
		WebElement add2 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
		Thread.sleep(2000);
		   add2.click();
	}
	
	public void user_click_the_back_to_product() throws InterruptedException {
		WebElement back = driver.findElement(By.cssSelector("#back-to-products"));
		Thread.sleep(2000);
		   back.click();
	}
	
	public void user_click_2nd_product_details() throws InterruptedException {
		WebElement back = driver.findElement(By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name ']"));
		Thread.sleep(2000);
		back.click();
	   
	}

	public void user_click_the_2nd_product_to_add_to_cart() throws InterruptedException {
		WebElement add2 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		Thread.sleep(2000);
		add2.click();
		driver.navigate().back();
		driver.close();
	}

}
