package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class AppiumSettingStepDef {
    AppSettingStepImpl appSetting=new AppSettingStepImpl();
    @Given("^open setting(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForOpenApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
      //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        appSetting.setUpConfigrationForOpenApp(caps12,appActivity,appActivity);

    }

}
