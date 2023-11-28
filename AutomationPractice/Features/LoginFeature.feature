Scenario: Login
    @tag
Feature: Succesful Login with Valid Creditials

  Given  User Lauch the Chrome Browser
   When   User Opens the URL "https://www.irctc.co.in/nget/train-search"
   Then   User Click on the Signin button
   And    User Enter the Username as "srbhanusr" && Password "Sr786bhanu786"
   Then   User Click on the Signin button
   When   Page Title should be "IRCTC Next Generation eTicketing System"
   And    User Click on the Logout button   


      
      
      
      
      
      
      
      
      
      
      
      
      
      
