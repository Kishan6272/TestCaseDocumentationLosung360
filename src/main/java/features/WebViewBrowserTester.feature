Feature: Testing the functionalities of WebViewBrowserDefaultEmulator for testing
  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open Web View Browser and do some randome testing
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |

  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator and able to print
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open Web View Browser then print and do some randome testing
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |

  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator and open google.com and open youtube through that
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open WebViewBrowserDefaultEmulator and open google.com then open youtube through that
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |

  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator and open google.com and open youtube through that
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open WebViewBrowserDefaultEmulator and open Flipkart.com then loging using mobile number
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |


  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator and open mail.com
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open WebViewBrowserDefaultEmulator and open mail.com then navigate on sidebar
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |


  Scenario Outline: verify that user is able to use WebViewBrowserDefaultEmulator and open mail.com
    Given open WebViewBrowserDefaultEmulator <capabilities> with <AppPackage> and <AppActivity>
    When open WebViewBrowserDefaultEmulator and open mail.com then premium and try to signin
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                       |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | org.chromium.webview_shell | org.chromium.webview_shell.WebViewBrowserActivity |






