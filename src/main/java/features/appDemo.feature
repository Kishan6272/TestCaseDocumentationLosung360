
Feature; testing the functionalities of mobile devices
Scenario Outline: User is able to dial number with Androiad Phone
Given create a driver  of dial a number through phone <capa bilities>
Then complete the number dialing process
Then quit the app driver
Examples:
| capabilities                                                                                                                                                  |
| deviceName=pixel_7,platformName=Android,platformVersion=14,appPackage=com.google.android.dialer,a