Feature: Testing the functionalities of Photos App
  Scenario Outline: verify that user is able to open Photos app
    Given open Photos <capabilities> with <AppPackage> and <AppActivity>
    When  open PhotosApp and do some browsing
    Then quit the app messaging
    Examples:
      | capabilities                                                                                                                          | AppPackage                     | AppActivity                    |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.apps.photos | com.google.android.apps.photos.home.HomeActivity |

  Scenario Outline: verify that user is able to open Photos app
    Given open Photos <capabilities> with <AppPackage> and <AppActivity>
    When  open PhotosApp and do some browsing
    Then quit the app messaging
    Examples:
      | capabilities                                                                                                                          | AppPackage                     | AppActivity                    |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.apps.photos | com.google.android.apps.photos.home.HomeActivity |