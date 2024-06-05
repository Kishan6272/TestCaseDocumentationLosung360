Feature: Testing the functionalities of Messaging App
  Scenario Outline: verify that user is able to check Messaging functionality is working fine or not
    Given open messaging <capabilities> with <AppPackage> and <AppActivity>
    When Send Message to any random number as user wants
    Then quit the app messaging
    Examples:
      | capabilities                                                                                                                          | AppPackage                        | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.apps.messaging | com.google.android.apps.messaging.ui.ConversationListActivity |

  Scenario Outline: verify that user is able to check by clicking on three dot then setting
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When user is able to toggle the MessageOutgoingSound
    Then quit the app messaging
    Examples:
      | capabilities                                                                                                                          | AppPackage                        | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.apps.messaging | com.google.android.apps.messaging.ui.ConversationListActivity |

  Scenario Outline: verify that user is able to check Messaging functionality Help&Feedback is working fine or not
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When user is able to send Help&Feedback
    Then quit the app messaging
    Examples:
      | capabilities                                                                                                                          | AppPackage                        | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.apps.messaging | com.google.android.apps.messaging.ui.ConversationListActivity |
