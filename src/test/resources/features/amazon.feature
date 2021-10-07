@test1
Feature: Amazon title verification and log in feature
  User Story: As a user, I should be able to verify the page title and login with correct credentials.

  Background: Assuming user is on homepage
    Given User is on homepage

  Scenario: Amazon default title verification
    #expected Amazon page title before log in: "Amazon.com. Spend less. Smile more."
    Then User should see Amazon page title as expected

  Scenario: Login with given credentials
    #please check out the congifuration.properties file to see given credentials
    When User clicks account navigation link
    And User enters email address
    And User clicks continue button
    And User enters password
    And User clicks sign-in button
    Then The url should contain navigation sign in parameter
    #expected url: https://www.amazon.com/?_encoding=UTF8&ref_=nav_ya_signin&

