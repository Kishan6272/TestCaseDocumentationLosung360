package TreefeStepDefAndImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class TreefeStepDef {

    TreefeStepImpl  treeStepImpl=new TreefeStepImpl();

    @Given("^open treefe (.*?) with (.*?) and (.*?)$")
    public void  setupConfigrationForTreefeApp(String caps1 , String appPackage, String appActivity) throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        treeStepImpl.setupConfigrationForTreefeApp(caps1,appPackage,appActivity);
    }

    @When("open treefe app and click icon")
    public void open_treefe_app_and_click_icon() {
        // Write code here that turns the phrase above into concrete actions
        treeStepImpl.open_treefe_app_and_click_icon();
    }

    @Then("quit the app driver")
    public void quit_the_app_driver() {
        // Write code here that turns the phrase above into concrete actions
        treeStepImpl.quit_the_app_driver();
    }
}
