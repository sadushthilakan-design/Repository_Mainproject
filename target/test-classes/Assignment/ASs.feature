Feature: Login

Background:
  Given User is on login page

Scenario: Valid Login
  When User enters valid credentials
  Then User should login successfully