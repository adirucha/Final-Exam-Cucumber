package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TodoListPage {
	WebDriver driver;
	public TodoListPage(WebDriver driver) {
		 this.driver =driver;
		 
	 }

	@FindBy(how=How.CSS,using="button[onclick='myFunctionSky()']")WebElement CLICK_ON_BLUE_BACKGROUND_BUTTON;
	@FindBy(how=How.CSS,using="button[onclick='myFunctionWhite()']")WebElement CLICK_ON_WHITE_BACKGROUND_BUTTON;
	@FindBy(how=How.CSS,using="[//body]")WebElement GET_BACKGROUND_COLOR;
	
	public void clickTheBlueBackgroundButton() {
		
		CLICK_ON_BLUE_BACKGROUND_BUTTON.click();
		
	}
	
	
public void clickTheWhiteBackgroundButton() {
		
		CLICK_ON_WHITE_BACKGROUND_BUTTON.click();
		
	}
	

}
