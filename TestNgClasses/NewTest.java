package TestNgClasses;

import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	
  @BeforeTest
  public void beforeTest() {
	  String baseUrl = "http://demo.guru99.com/selenium/newtours/";					
	  System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
      WebDriver driver = new ChromeDriver();					
      		
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

	  driver.get(baseUrl);					
	  
  }
	
  @Test
  public void f() {
	  
	  System.out.println("Hay welcome to testng....");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Hay welcome to testng2....");

  }

}
