Feature: Login and validate page
Scenario: Login with valid credentials
Given user is on Agile project page 
When enter username and  password 
And user click the login button 
And explore the navigated page 
Then user successfully logout 
