Feature: Payment Gateway Test
Scenario: Generate card number and verify page
Given  user opens payment gateway page
And user clicks on Generate Card Number
Then card number should be displayed
And user select and buy item 
Then user is on payment gateway 


