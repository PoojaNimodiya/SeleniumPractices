package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFormsRadioBtnCheckboxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frameUrl = "http://demo.guru99.com/selenium/webform/login.html";
		
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		/*driver.get(frameUrl);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
        WebElement login = driver.findElement(By.id("SubmitLogin"));	

		
		email.sendKeys("abc@com.com");
		email.clear();
		email.sendKeys("abc@com.com");
		
		password.sendKeys("asdfgh");
		login.click();*/
		
//===========================================================================================
		
		String radioUrl = "http://demo.guru99.com/selenium/webform/radio.html";
		
		driver.get(radioUrl);
		
		WebElement r1 = driver.findElement(By.id("vfb-7-1"));
		r1.click();
		
		boolean val = r1.isSelected();
		System.out.println(val);
		
		WebElement c1 = driver.findElement(By.id("vfb-6-0"));
		c1.click();
		
		boolean val1 = r1.isSelected();
		System.out.println(val1);
		
		System.out.println(c1.isEnabled());
		
		c1.click();
		System.out.println(c1.isSelected());

		
		driver.close();
		
		
		
		
		//driver.close();


	}

}
