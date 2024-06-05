package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class ClockDemoStepDef {
    ClockDemoStepImpl clockDemoStepImpl=new ClockDemoStepImpl();

    @Given("^open clock(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForClockApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        clockDemoStepImpl.setUpConfigrationForClockApp(caps12,appPackage,appActivity);

    }
    @When("Start StopWatch and rest")
    public void startStopWatchAndReset() throws InterruptedException {
        clockDemoStepImpl.startStopWatchAndReset();
    }



    @When("Start clock and set alarm")
    public void startClockAndSetAlarm() throws InterruptedException {
        clockDemoStepImpl.startClockAndSetAlarm();
    }

}
