Feature: Expolre Yahoo page 
Scenario: User can navigate to page and use the links
Given user navigate to the Yahoo link  
When user can select the links
And user can download yahoo through the link 
And user gets page title 
Then  title  should be "Yahoo"



