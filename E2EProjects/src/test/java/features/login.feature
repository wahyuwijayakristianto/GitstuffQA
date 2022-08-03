Feature: Login into Application
  Scenario: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to the "http://qaclickacademy.com" Site
    And Click on Login link in home page to land on Secure sign in Page
    When User enters "Username" and "Password" and logs in
    Then Verify that user is successfully logged in
