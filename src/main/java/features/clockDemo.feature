Feature: Testing the functionalities of default Clock app
  Scenario Outline: verify that user is able to use clock functionality fine or not
    Given open clock <capabilities> with <AppPackage> and <AppActivity>
    When Start StopWatch and rest
    Then quit the app driver
    Examples:
      | capabilities                                                | AppPackage                   | AppActivity                     |  |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | com.google.android.deskclock | com.android.deskclock.DeskClock |  |

  Scenario Outline: verify that user is able to use clock functionality fine or not
    Given open clock <capabilities> with <AppPackage> and <AppActivity>
    When Start clock and set alarm
    Then quit the app driver
    Examples:
      | capabilities                                                | AppPackage                   | AppActivity                     |  |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | com.google.android.deskclock | com.android.deskclock.DeskClock |  |