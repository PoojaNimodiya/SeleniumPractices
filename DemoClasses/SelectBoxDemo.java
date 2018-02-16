package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseUrl = "http://demo.guru99.com/selenium/newtours/register.php";
		
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		//dropdown.selectByVisibleText("INDIA");
		dropdown.selectByValue("INDIA");

	}

}
