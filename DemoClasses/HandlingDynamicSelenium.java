package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class HandlingDynamicSelenium { 
    public static void main (String[] args)
{
    WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
    wd = new ChromeDriver();
    wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
     wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement baseTable = wd.findElement(By.tagName("table"));
    
    //To fimd third row of table
    WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
    
    WebElement tableRowText = baseTable.findElement(By.xpath ("//*[@id='left container']/table/tbody/tr[3]/td[1]"));
    
    String rowtext = tableRow.getText();
    System.out.println("Third row of table : "+rowtext);
    
    //to get 3rd row's 2nd column data
    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
    String valueIneed = cellIneed.getText();
    System.out.println("Cell value is : " + valueIneed); 
    wd.close();
}    //*[@id='leftcontainer']/table/tbody/tr[3]
}
