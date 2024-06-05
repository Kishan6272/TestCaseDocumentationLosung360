package phoneDemo;

import appiumPractise.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class AppiumSettingStepDef {
    AppSettingStepImpl appSetting=new AppSettingStepImpl();
    @Given("^open setting(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForOpenApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
      //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        appSetting.setUpConfigrationForOpenApp(caps12,appPackage,appActivity);

    }
    @When("Complete the functionality of Display Setting")
    public void completeTheFunctionallityOfDisplaySetting() throws InterruptedException {
       appSetting.completeTheFunctionallityOfDisplaySetting();
    }

    @When("enable disable do_not_disturb button")
    public void enableDisableDoNotDisturbButton() throws InterruptedException {
        appSetting.enableDisableDoNotDisturbButton();
    }

    @When("Account Setting turn off and on mobile data")
    public void accountSettingsTurnOffAndOnData() throws InterruptedException {
        appSetting.accountSettingsTurnOffAndOnData();
    }

    //click on SdCard and view some items in the side navbar
    @When("click on SdCard and view some items in the side navbar")
    public void clickOnSdCardAndViewSideNaveBar() throws InterruptedException {
        appSetting.clickOnSdCardAndViewSideNaveBar();
    }

    @When("on the date saver button")
    public void onTheDataSaverButton() throws InterruptedException {
        appSetting.onTheDataSaverButton();
    }

    @When("able to on and off button ManageAppsAutomatically")
    public void ableToToggleButtonManageAppsAutomatically() throws InterruptedException {
        appSetting.ableToToggleButtonManageAppsAutomatically();
    }

    @Then("quit the app")
    public void quitTheAppDriver(){
        CommonUtils.androidDriver.get().quit();
    }


}
