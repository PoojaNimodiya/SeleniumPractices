package Parameter;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//
public class dataProviders {
	
	WebDriver driver;
	
  @BeforeTest
  public void setUp(){
	  String baseUrl = "https://google.com";					
	  System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();					
      		
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

	  driver.get(baseUrl);
  }
  @Test(dataProvider = "SearchProvider")
  public void data(String author, String searchKey) {
	  
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys(searchKey);
	  
	  System.out.println("Welcome " +author+ " Your seachkey is " +searchKey);
	  Assert.assertTrue(searchBox.getAttribute("value").equalsIgnoreCase(searchKey));
	  searchBox.clear();
  }
  
  @DataProvider(name="SearchProvider") 
  public Object[][] getDataProvider(Method m){
	  if(m.getName().equalsIgnoreCase("data"))
	  return new Object[][]
			  {
		  			{"guru99","India"},
		  			{"guru91","UK"},
		  			{"guru90","USA"}
			  };
	 else
		 return new Object[][]
				  {
			  			{"India"},
			  			{"UK"},
			  			{"USA"}
				  };
  }
}

//Calling the Dataproviders from other class
//Only two things need to do here is, 
//dataprovider method should be static and 
//for the Test method need to give the dataprovider class name "dataProviderClass=DataproviderClass.class"