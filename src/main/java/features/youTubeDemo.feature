Feature: Testing the functionalities of YouTube
  Scenario Outline: verify that user is able to click on you
    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
    When open You then setting
    Then quit the app
    Examples:
      | capabilities                                                | AppPackage                 | AppActivity                                                         |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11 | com.google.android.youtube | com.google.android.apps.youtube.app.watchwhile.InternalMainActivity |


#
#  Scenario Outline: verify that user is able to click on you the able to toggle autoplay
#    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
#    When open You then setting then toggle AutoPlay
#    Then quit the app
#    Examples:
#      | capabilities                                                                                                                          | AppPackage                 | AppActivity                                                   |
#      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.youtube | com.google.android.apps.youtube.app.settings.SettingsActivity |
#
#  Scenario Outline: verify that user is able to click on you then Settings then VideoQualityPreferance choose higher picture quality
#    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
#    When open You then setting then VideoQualityPreferance then higher picture quality
#    Then quit the app
#    Examples:
#      | capabilities                                                                                                                          | AppPackage                 | AppActivity                                                   |
#      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.youtube | com.google.android.apps.youtube.app.settings.SettingsActivity |
#
#  Scenario Outline: verify that user is able to click on you then Settings then VideoQualityPreferance choose higher picture quality
#    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
#    When open You then setting then VideoQualityPreferance then higher picture quality
#    Then quit the app
#    Examples:
#      | capabilities                                                                                                                          | AppPackage                 | AppActivity                                                   |
#      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.youtube | com.google.android.apps.youtube.app.settings.SettingsActivity |
#
#  Scenario Outline: verify that user is able to click on you then Settings then VideoQualityPreferance choose higher picture quality
#    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
#    When open You then setting then VideoQualityPreferance then higher picture quality
#    Then quit the app
#    Examples:
#      | capabilities                                                                                                                          | AppPackage                 | AppActivity                                                   |
#      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.youtube | com.google.android.apps.youtube.app.settings.SettingsActivity |
#
#  Scenario Outline: verify that user is able to click on you then Settings then VideoQualityPreferance choose higher picture quality
#    Given open youTube <capabilities> with <AppPackage> and <AppActivity>
#    When open You then setting then VideoQualityPreferance then higher picture quality
#    Then quit the app
#    Examples:
#      | capabilities                                                                                                                          | AppPackage                 | AppActivity                                                   |
#      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.settings,appActivity=com.android.settings.Settings | com.google.android.youtube | com.google.android.apps.youtube.app.settings.SettingsActivity |
