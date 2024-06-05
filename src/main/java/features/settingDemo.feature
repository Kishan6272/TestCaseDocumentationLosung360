Feature: Testing the functionalities of Settings of Phone
  Scenario Outline: verify that user is able to check settings is working fine or not
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When Complete the functionality of Display Setting
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |

  Scenario Outline: verify that user is able to check settings able to an and off the Do_Not_Disturb button
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When enable disable do_not_disturb button
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |

  Scenario Outline: verify that user is able to check settings then accounts then turn off and on
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When Account Setting turn off and on mobile data
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |

  Scenario Outline: verify that user is able to check settings then SdCard the able to view click sidebar all option
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When  click on SdCard and view some items in the side navbar
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |

  Scenario Outline: verify that user is able to navigate network and internet and able to on the data saver
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When  on the date saver button
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |

  Scenario Outline: verify that user is able to navigate battery then battery manager
    Given open setting <capabilities> with <AppPackage> and <AppActivity>
    When  able to on and off button ManageAppsAutomatically
    Then quit the app
    Examples:
      | capabilities                                                                                                                          | AppPackage           | AppActivity                   |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.android.settings | com.android.settings.Settings |









