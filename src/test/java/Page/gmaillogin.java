package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class gmaillogin  {
	
	static WebDriver driver = new ChromeDriver();
		
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp3vm40KPVB-pZNckPlJThmHFK2u-04eS6yaqxKdfDhw7NbE0ZHKAojmNvtzn6l6UGluOMi5iA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-956153274%3A1702392210373668&theme=glif");
		
		  {
			WebElement username1	= driver.findElement(By.xpath("//input[@id='identifierId']"));
			username1.sendKeys("priyanshjauhari13@gmail.com");
			Thread.sleep(2000);
			WebElement Next	= driver.findElement(By.xpath("//span[normalize-space()='Next']"));
			Next.click();
			Thread.sleep(2000);
			WebElement Password1	= driver.findElement(By.xpath("//input[@name='password']"));
			Password1.sendKeys("Rishu@8090");
			Thread.sleep(2000);
			WebElement Next2	= driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		
		
		}
			
	
	    
	}
	
	


}
