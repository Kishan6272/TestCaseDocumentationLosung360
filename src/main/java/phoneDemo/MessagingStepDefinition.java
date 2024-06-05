package phoneDemo;

import appiumPractise.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MessagingStepDefinition {
    MessagingStepImplementation messagingStepImplementation=new MessagingStepImplementation();
    @Given("^open messaging(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForOpenMessagingApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        messagingStepImplementation.setUpConfigrationForOpenMessagingApp(caps12,appPackage,appActivity);

    }

    @When("Send Message to any random number as user wants")
    public void sentMessageToAnyRandomNumber()
    {
          messagingStepImplementation.sentMessageToAnyRandomNumber();
    }

    @When("user is able to toggle the MessageOutgoingSound")
    public void userIsAbleToToggleTheMessagingOutgoingButton() throws InterruptedException {
        messagingStepImplementation.userIsAbleToToggleTheMessagingOutgoingButton();
    }



    @When("user is able to send Help&Feedback")
    public void userIsAbleToSendHelpAndFeedback()
    {
        messagingStepImplementation.userIsAbleToSendHelpAndFeedback();
    }

    @Then("quit the app messaging")
    public void quitTheAppDriver(){
        CommonUtils.androidDriver.get().quit();
    }
}
