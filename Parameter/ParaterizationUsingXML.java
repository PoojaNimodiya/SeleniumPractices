package Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParaterizationUsingXML {
  WebDriver driver;
  
  @BeforeTest
  public void setUp(){
	  
	  String baseUrl = "https://google.com";					
	  System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();					
      		
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

	  driver.get(baseUrl);
	  
  }
	
  @Test
  @Parameters({"author", "searchKey"})
  public void testParameterWithXML(String author,String searchKey) {
	  
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys(searchKey);
	  
	  System.out.println("Welcome" +author+ "Your searchkey is" +searchKey);
	  
	  System.out.println("Thread Will Sleep For Sometime....");
	  
	 System.out.println("Value is the google searchbox =" +searchBox.getAttribute("value")+ "Value given by input  field = " +searchKey);
	 
	 Assert.assertTrue(searchBox.getAttribute("value").equalsIgnoreCase(searchKey) );
  }
}
