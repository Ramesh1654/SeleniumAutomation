Feature: Login

@tag1
Scenario: Succesful Login with Valid Creditials
 Given  User Lauch the Chrome Browser
 When    User Opens the URL "https://www.irctc.co.in/nget/train-search"
 Then    User Click on the Login button
 And     User Enter the Username as "srbhanusr" && Password "Sr786bhanu786"
 Then    User Click on the Signin button
 When    Page Title should be "IRCTC Next Generation eTicketing System"
 And     User Click on the Logout button  


#@tag2
#Scenario: Succesful Login with Orangehrm Valid Creditials
 #Given  User Lauch the Chrome Browser
 #When    User Opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 #Then    User Enter the Username as "Admin" && Password "admin123"
 #And     User Click on the Login button
 #When    Page Title should be "OrangeHRM"
 #Then    User Click on the Userdropdown
 #And     User Select & Click on the Logout button 
      
      
      
      
      
      
      
      
      
      
      
      
      
