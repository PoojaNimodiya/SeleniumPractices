package DemoClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseUrl = "http://google.com";
		String actualTitle = "";
		String expectedTitle ="Google";
		
		//Open Firebox Browser
		/*System.setProperty("webdriver.gecko.driver", "D:/Jars/geckodriver-v0.19.0-win32/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");*/
		
		//Open Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Passed...");
		}
		else {
			System.out.println("Failed...");

		}
		
		driver.close();
		System.out.println("Close the Browser....");

	}

}
