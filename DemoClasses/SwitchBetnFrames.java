package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frameUrl = "http://demo.guru99.com/selenium/deprecated.html";
		
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(frameUrl);
		
		//Switch between frames 
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		
//=======================================================================================
		String alertUrl = "http://jsbin.com/usidix/1";
		
		driver.get(alertUrl);
		
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		

		
		
		//close Browser
		//driver.close();
	}

}
