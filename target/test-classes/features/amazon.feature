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
    When User hover over navigation link and click sign in button
    And User enters email address
    And User clicks continue button
    And User enters password
    And User clicks sign-in button
    Then The url should contain navigation sign in parameter
    #expected url: https://www.amazon.com/?ref_=nav_signin&

