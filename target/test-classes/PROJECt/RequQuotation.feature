Feature: Make a Quatation in Guru99 insurance
Scenario: Fill and submit quatation form 
Given user logged into insurance application page 
When user navigate  to request quatation page 
And user enters the required data
And  user calculate premium 
And user sumbit request form 
Then quatation should be create  successfully 


