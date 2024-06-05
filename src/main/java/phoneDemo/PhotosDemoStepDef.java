package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class PhotosDemoStepDef {

  PhotosDemoStepImpl photosDemoStepImpl=new PhotosDemoStepImpl();

    @Given("^open Photos (.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForPhotosApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        photosDemoStepImpl.setUpConfigrationForPhotosApp(caps12,appPackage,appActivity);

    }

    @When("open PhotosApp and do some browsing")
    public void openPhotosAndUpdate() throws InterruptedException {
        photosDemoStepImpl.openPhotosAndUpdate();
    }
}
