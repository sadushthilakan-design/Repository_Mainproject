Feature: Navigate to Delete Customer page and use delete function
Scenario: Delete customer using customer ID
Given user on selenium menu 
When user navigate to delete form page
And enter customer ID and delete customer 
And check reset button  
Then verify the user delete valid user 


