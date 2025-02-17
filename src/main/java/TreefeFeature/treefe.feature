Feature: Launch app and navigate to + icon

  Scenario Outline: open treefe app and click on icon and do some navigation
    Given open treefe <capabilities> with <AppPackage> and <AppActivity>
    When open treefe app and click icon
    Then quit the app driver
    Examples:
      | capabilities                                                          | AppPackage   | AppActivity               |
      | deviceName=Pixel 8 Pro API 34,platformName=Android,platformVersion=14 | com.i.treefe | com.i.treefe.MainActivity |




