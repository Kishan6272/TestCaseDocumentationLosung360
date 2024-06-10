package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class YouTubeStepDemo {

    YouTubeStepDemoImpl youTubeStepDemoImpl=new YouTubeStepDemoImpl();
    @Given("^open youTube(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForOpenYouTube(String caps12, String appPackage, String appActivity) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        youTubeStepDemoImpl.setUpConfigrationForOpenYouTube(caps12,appPackage,appActivity);

    }
    @When("open You then setting")
    public void openYouTubeThenSettingToggleDataSaver() throws InterruptedException {
        youTubeStepDemoImpl.openYouTubeThenSettingToggleDataSaver();
    }

//    @When("open You then setting then toggle AutoPlay")
//    public void openYouTubeThenSettingToggleAutoplay() throws InterruptedException {
//        youTubeStepDempImpl.openYouTubeThenSettingToggleAutoplay();
//    }
//
//
//    @When("open You then setting then VideoQualityPreferance then higher picture quality")
//    public void openYouTubeThenSettingThenVideoQualityPreferanceToHigher() throws InterruptedException {
//        youTubeStepDempImpl.openYouTubeThenSettingThenVideoQualityPreferanceToHigher();
//    }
}
