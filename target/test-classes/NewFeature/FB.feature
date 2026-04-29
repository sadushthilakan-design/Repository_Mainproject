Feature:Login facebook login functionaliry
Scenario:login with valid credentials
Given open the browser
And user is navigated to the facebook login page
When user enters the email "sadush@gmail.com 
And user enters the password"sadu@123"
And user clicks on login button 
Then user navigates into the facebook homepage 
