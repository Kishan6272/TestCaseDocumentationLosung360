package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class smartMoneyStepDef {

   smartMoneyStepImpl smartMoneyStepImpl=new smartMoneyStepImpl();
    @Given("^open Smart Money(.*?) with (.*?)$")
    public void setUpConfigrationForSmartMoney(String cap, String App) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        smartMoneyStepImpl.setUpConfigrationForSmartMoney(cap,App);

    }

    @When("app screen is launched select environment")
    public void app_screen_is_launched_select_environment() throws InterruptedException {
        smartMoneyStepImpl.app_screen_is_launched_select_environment();
    }

    @Given("open Smart Money from app screen")

    public void open_Smart_Money_from_app_Screen() throws InterruptedException {
        phoneDemo.smartMoneyStepImpl.open_Smart_Money_from_app_Screen();
    }




}
