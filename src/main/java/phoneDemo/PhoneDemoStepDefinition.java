package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PhoneDemoStepDefinition extends CommonUtils{

    private AppiumDriver appiumDriver;
    private static AndroidDriver androidDriver;




    PhoneDemoStepImplimentation phoneDemoStepImplimentation=new PhoneDemoStepImplimentation();

    @Given("^create a driver of dial a number through phone (.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForPhoneApp(String caps1, String appPackage , String appActivity ) throws MalformedURLException {
       phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1,appPackage,appActivity);

    }


    @When("open phone dialer app and type the number and veify the above text")
    public void completeTheFunctionalityOfPhoneDailer() throws MalformedURLException {
        phoneDemoStepImplimentation.completeTheFunctionalityOfPhoneDailer();
    }

    @When("do add to contact sucessfully")
    public void addToContactSucessfull() throws InterruptedException {
        phoneDemoStepImplimentation.addToContactSucessfull();
    }

    @When("dial a customer by Name")
    public void dial_A_CustomerByName() throws InterruptedException {
        phoneDemoStepImplimentation.dial_A_CustomerByName();
    }

    @Then("quit the app driver")
    public void quitTheAppDriver(){
        CommonUtils.androidDriver.get().quit();
    }

}
