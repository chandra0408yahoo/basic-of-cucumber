package defs;

import Methods.homepagemethods;
import Utilities.webconnector;
import cucumber.api.DataTable;
import cucumber.api.formatter.AnsiEscapes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Utilities.webconnector.open_browser;


public class Stepdefs  extends methodsForapi{

    public  homepagemethods home;

    public Stepdefs() {

          home  = PageFactory.initElements(webconnector.open_browser(),homepagemethods.class);
    }


    @Before()
    public void openBrowser(){

        open_browser();
        webconnector.open_browser().get("http://automationpractice.com/index.php");



    }


    @Given("^This is login$")
    public void this_is_login() {

        System.out.println("hello");
    }

    @When("^This is execute action$")
    public void this_is_execute_action()  {
        System.out.println("hello");
    }

    @Then("^This is assert result$")
    public void this_is_assert_result()  {
        System.out.println("hello");
    }


    @Given("^This is login as (.*)$")
    public void this_is_login_as(String arg1) throws InterruptedException {
        //homepage_method. click_on_Arrangement_tab();
        System.out.println("Parameters"+AnsiEscapes.CYAN + arg1 + AnsiEscapes.RESET);

    }


    @Given("^this is example for data table$")
    public void this_is_example_for_data_table(DataTable dt)  {
        List<String> list = dt.asList(String.class);
        System.out.println("Username - " + list.get(0));

    }






    @Given("^this testing puropse is (.*)$")
    public void thisTestingPuropseIsUser(String STR) {

        System.out.println("testing wiht outline"+STR);
    }



    @Given("^i try to do api test$")
    public void iTryToDoApiTest() {

//get user
     /*   apitest();
        verifyThatResponseWasCreated();*/

//create uesr
        /*createuser();
        verifyThatResponseWasCreated1();*/

//get all user
        apitestgetallusers();

    }
}
