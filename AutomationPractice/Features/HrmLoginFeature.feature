Feature: Login

#@tag1
#Scenario: Succesful Login with Orangehrm Valid Creditials
 #Given  User Lauch the Chrome Browser
 #When    User Opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 #Then    User Enter the Username as "Admin" && Password "admin123"
 #Then     User Click on the Login button
 #When    Page Title should be "OrangeHRM"
 #Then    User Click on the Userdropdown
 #Then     User Select & Click on the Logout button

 @tag2
Scenario: Succesful Login with Orangehrm Valid Creditials
 Given  User Lauch the Chrome Browser
 When    User Opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 And     User Enter the Username as "Admin" && Password "admin123"
 Then    User Click on the Login button
 When    Page Title should be "OrangeHRM"
 And     User Click on the My Info
 Then    User Click on the Userdropdown
 Then    User Select & Click on the Logout button
 
 
 
 