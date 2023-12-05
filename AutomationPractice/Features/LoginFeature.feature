Feature: Login

@tag1
Scenario: Succesful Login with Valid Creditials
 Given  User Launch the Chrome Browser1
 When    User Opens the URL "https://www.irctc.co.in/nget/train-search"
 Then    User Click on the Login button
 And     Userr Enter thee Username as "srbhanusr" && Password "Sr786bhanu786"
 Then    User Click on the Signin button
 When    Page Title should be "IRCTC Next Generation eTicketing System"
 And     User Click on the Logout button  



      
      
      
      
      
      
      
      
      
      
      
      
      
