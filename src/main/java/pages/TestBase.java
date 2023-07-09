package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class TestBase {

	public static WebDriver driver;

	public static void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}
	public static void takeScreenShot(String fileName ) throws IOException {
		// Take screenshot and store it as file name
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Copy file to desired location and store in a folder
		FileUtils.copyFile(file, new File("C:/Users/adiru/codebase/Final-Exam-Cucumber/screenShots/"+fileName+".png"));
		
	}
	public void getBackgroundColor() {
		
		String getColor= driver.findElement(By.xpath("/html/body")).getCssValue("background-color");
		System.out.println(getColor);
//		String actualBackgroundColor= Color.fromString(getColor).asHex();
//		java.awt.Color c = new java.awt.Color(actualBackgroundColor);
		final String expectedColorSBlue ="rgba(135, 206, 235, 1)";
		final String expectedColorWhite ="rgba(255, 255, 255, 1)";
		
		switch(getColor) {
		case expectedColorSBlue:{
			System.out.println("blue");
			break;
		}
		case expectedColorWhite:{
			System.out.println("white");
			break;
		}
		default:{
			System.out.println("not white or blue");
		}
		}
		
		

		
		
	}

}
