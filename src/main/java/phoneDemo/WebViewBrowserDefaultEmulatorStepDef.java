package phoneDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class WebViewBrowserDefaultEmulatorStepDef {

    WebViewBrowserDefaultEmulatorStepImpl webViewBrowserDefaultEmulatorStepImpl=new WebViewBrowserDefaultEmulatorStepImpl();

    @Given("^open WebViewBrowserDefaultEmulator(.*?) with (.*?) and (.*?)$")
    public void setUpConfigrationForWebView(String caps12, String appPackage, String appActivity) throws MalformedURLException {
        //  phoneDemoStepImplimentation.setUpConfigrationForPhoneApp(caps1);
        webViewBrowserDefaultEmulatorStepImpl.setUpConfigrationForWebView(caps12,appPackage,appActivity);

    }
    @When("open Web View Browser and do some randome testing")
    public void openWebViewAndPerformSomeRandomeTesting() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewAndPerformSomeRandomeTesting();
    }
    //open Web View Browser then print and do some random testing

    @When("open Web View Browser then print and do some randome testing")
    public void openWebViewThenPrintSomeRandomeTesting() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewThenPrintSomeRandomeTesting();
    }

    @When("open WebViewBrowserDefaultEmulator and open google.com then open youtube through that")
    public void openWebViewBrowserDefaultEmulatorThenYoutubeThroughThat() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewBrowserDefaultEmulatorThenYoutubeThroughThat();
    }

    @When("open WebViewBrowserDefaultEmulator and open Flipkart.com then loging using mobile number")
    public void openWebViewBrowserDefaultEmulatorThenFlipkartLoginUsingMobile() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewBrowserDefaultEmulatorThenFlipkartLoginUsingMobile();
    }

    @When("open WebViewBrowserDefaultEmulator and open mail.com then navigate on sidebar")
    public void openWebViewBrowserDefaultEmulatorThenMailThenNavigateSidebar() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewBrowserDefaultEmulatorThenMailThenNavigateSidebar();
    }

    @When("open WebViewBrowserDefaultEmulator and open mail.com then premium and try to signin")
    public void openWebViewBrowserDefaultEmulatorThenPremiumAndTryToSignIn() throws InterruptedException {
        webViewBrowserDefaultEmulatorStepImpl.openWebViewBrowserDefaultEmulatorThenPremiumAndTryToSignIn();
    }
}
