Feature: Testing the functionalities of Smart Money app

  Scenario Outline: verify that user is able set env or not
    Given open Smart Money <capabilities> with <App>
    When  app screen is launched select environment
  # Then
  #  Then  quit the app driver

    Examples:
      | capabilities                                                | App                                                 |  |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | C:\Users\Kishan Kumar Pandey\Downloads\base (2).apk |  |

  Scenario Outline: verify that user is able login with the mobile number or not
    Given open Smart Money from app screen
 #   When  app screen is launched select environment
  # Then
  #  Then  quit the app driver

    Examples:
      | capabilities                                                | App                                                 |  |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | C:\Users\Kishan Kumar Pandey\Downloads\base (2).apk |  |