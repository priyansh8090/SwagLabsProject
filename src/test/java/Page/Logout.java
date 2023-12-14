package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;

public class Logout extends Base{

	
	public void user_should_navigate_to_left_sidebar() throws InterruptedException {
	   WebElement sider= driver.findElement(By.cssSelector("#react-burger-menu-btn"));
	   Thread.sleep(2000);
	   sider.click();
	}
	

	
	public void user_click_the_logout_button() throws InterruptedException {
		WebElement Logout=driver.findElement(By.cssSelector("#logout_sidebar_link"));
		 Thread.sleep(2000);
		Logout.click();
	    
	}
	
	public void user_should_logout_from_swag_labs() {
		WebElement text =driver.findElement(By.cssSelector(".login_logo"));
		text.getText();
		
		
	}
	
	
	
}
