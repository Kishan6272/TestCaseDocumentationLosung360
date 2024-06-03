Feature: Testing the functionalities of default phone app
#  Scenario Outline: verify that user is able to check the phone dialer functionality is working fine
#    Given create a driver of dial a number through phone <capabilities> with <AppPackage> and <AppActivity>
#    When open phone dialer app and type the number and veify the above text
#    Then quit the app driver
#    Examples:
#      | capabilities                                                                                                                                     | AppPackage         | AppActivity                               |  |
#
#      | deviceName=Pixel 6a,platformxName=Android,platformVersion=11,appPackage=com.android.dialer,appActivity=com.android.dialer.main.impl.MainActivity | com.android.dialer | com.android.dialer.main.impl.MainActivity |  |



#  Scenario Outline: verify that user is able to check the phone dialer functionality is working fine
#    Given create a driver of dial a number through phone <capabilities> with <AppPackage> and <AppActivity>
#    When do add to contact sucessfully
#    Then quit the app driver
#    Examples:
#      | capabilities                                                                                                                                     | AppPackage         | AppActivity                               |  |
#      | deviceName=Pixel 6a,platformxName=Android,platformVersion=11,appPackage=com.android.dialer,appActivity=com.android.dialer.main.impl.MainActivity | com.android.dialer | com.android.dialer.main.impl.MainActivity |  |


  Scenario Outline: verify that user is able to check the phone dialer functionality is working fine
    Given create a driver of dial a number through phone <capabilities> with <AppPackage> and <AppActivity>
    When dial a customer by Name
    Then quit the app driver
    Examples:
      | capabilities                                                                                                                                     | AppPackage         | AppActivity                               |  |
      | deviceName=Pixel 6a,platformxName=Android,platformVersion=11,appPackage=com.android.dialer,appActivity=com.android.dialer.main.impl.MainActivity | com.android.dialer | com.android.dialer.main.impl.MainActivity |  |


#  Scenario Outline: verify that user is able to check the phone dialer functionality is working fine
#    Given create a driver of dial a number through phone <capabilities> with <AppPackage> and <AppActivity>
#    When dial a customer by Name
#    Then quit the app driver
#    Examples:
#      | capabilities                                                                                                                                     | AppPackage         | AppActivity                               |  |
#      | deviceName=Pixel 6a,platformxName=Android,platformVersion=11,appPackage=com.android.dialer,appActivity=com.android.dialer.main.impl.MainActivity | com.android.dialer | com.android.dialer.main.impl.MainActivity |  |