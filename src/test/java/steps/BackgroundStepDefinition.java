package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestBase;
import pages.TodoListPage;

public class BackgroundStepDefinition extends TestBase{
	TodoListPage todolistpage;
	@Given("user is on the todolist page")
	public void user_is_on_the_todolist_page() {
		init();
		driver.get("http://techfios.com/test/101/");
	}

	@When("user click on the skyblue backgroud button")
	public void user_click_on_the_skyblue_backgroud_button() {
		TodoListPage todolistpage =PageFactory.initElements(driver, TodoListPage.class);
		todolistpage.clickTheBlueBackgroundButton();

	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		System.out.println("Backgroud is changed to  Blue");

	}

	@When("user click on the white backgroud button")
	public void user_click_on_the_white_backgroud_button() {
		TodoListPage todolistpage =PageFactory.initElements(driver, TodoListPage.class);
		todolistpage.clickTheWhiteBackgroundButton();

	}
	@Then ("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		
		System.out.println("Backgroud is changed to  White");

	}


}
