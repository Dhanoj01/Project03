Feature: complete checkout

Scenario: Successful checkout
  Given user is on login page
  When user logs in
  And user adds two products
  And user proceeds to checkout
  And user enters details
  Then order completes successfully
