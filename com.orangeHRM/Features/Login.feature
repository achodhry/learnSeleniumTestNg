Feature: Login

Scenario: Successful Login with Valid Credentials

    Given User Lauch Chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com"
    And User enters Email as "Admin" and Password as "admin123"
    And Click on Login	
    Then Page Title should be "OrangeHRM"
    When User click on Log out link
    Then Page Title should be "OrangeHRM"
    And Close browser
    
 