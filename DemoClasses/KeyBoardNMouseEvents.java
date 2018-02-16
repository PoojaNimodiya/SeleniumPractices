package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardNMouseEvents {
    public static void main(String[] args) {		
    	
    	String baseUrl = "https://paytm.com/";					
 		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
         		
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

 		driver.get(baseUrl);			
 		
 		WebElement ele = driver.findElement(By.linkText("Electricity"));
 		
 		Actions action = new Actions(driver);
 		
 		Action mouseOverHome = action.moveToElement(ele).build();
 		
 		String bgColor = ele.getCssValue("background-color");
 		System.out.println(bgColor);
 		
 		mouseOverHome.perform();
 		
 		String bgColo1r = ele.getCssValue("background-color");
 		System.out.println(bgColo1r);
 		
 		
 		
    }

}
