package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://demo.guru99.com/popup.php";					
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
        		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

		driver.get(baseUrl);				
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainWindow = driver.getWindowHandle();

	}

}
