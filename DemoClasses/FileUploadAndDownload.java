package DemoClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAndDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUrl = "http://demo.guru99.com/selenium/upload/";					
 		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
         		
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

		driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("D:\\newhtml.html");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}

}
