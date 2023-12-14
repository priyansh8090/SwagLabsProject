package Base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
public  static Properties prop;
public  static WebDriver driver;

static {
	
	try {
		FileInputStream file= new FileInputStream("TestData/env.properties");
		 prop =new Properties();
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

	
	
@Before
	public void setup() {

		//String browserName = prop.getProperty("browser");




		driver = new ChromeDriver();
	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	public void selectDropDown(WebElement ele, String value, String type) {

		Select s = new Select(ele);
		switch (type) {
		case "visibletext":
			s.selectByVisibleText(value);
			break;
		case "Index":
			s.selectByIndex(Integer.parseInt(value));
		case "value":
			s.selectByValue(value);
			break;

		}

	}

	public void actionMethods(WebElement ele, String methodType) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		switch (methodType) {
		case "dragAndDrop":
			a.dragAndDrop(ele, ele);
			break;
		case "click":
			a.click(ele);
			break;

		}

	}

	public void BootStarpDropDown(List<WebElement> list, String value) {
		for (WebElement ele : list) {

			String eletext = ele.getText();
			if (eletext.equals(value))
				ele.click();
		}
	}

	public void switchwindow(String tittle, String methodType) {
		WebDriver driver = new ChromeDriver();
		Set<String> allwindows = driver.getWindowHandles();

		for (String w : allwindows) {
			driver.switchTo().window(w);
			switch (tittle) {
			case "tittle":
				driver.switchTo().window(tittle);
				break;
			case "text":
				driver.switchTo().alert();
				break;

			}

		}
	}

	public void HandleAlert(String type) {
		Alert a = driver.switchTo().alert();
		switch (type) {
		case "select":
			a.accept();
			break;
		case "cancle":
			a.dismiss();
			break;

		}

	}

	public void waitForElement(int timeout, String condition) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		switch (condition) {
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;

		}

	}

	public void ClickOnElement(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);

		}

	}

	public void Explictwait(WebElement ele, String Condition) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		switch (Condition) {
		case "Visibility":
			wait.until(ExpectedConditions.visibilityOf(ele));
			break;
		case "alertIsPresent":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
		case "invisibilityOf":
			wait.until(ExpectedConditions.invisibilityOf(ele));
			break;

		}

	}

	public void implictWait(Integer Timeouts) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeouts));

	}

public void Checkbox(WebElement ele, int count) {
	Checkbox(ele, count);

}

	
	


public void TearDown(Scenario s, String Expected) throws IOException {
	
	if(s.isFailed()) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("Screenshot/" +s.getName() +".png"));
	}
		driver.quit();
		
	}
}




