Feature: Login

@tag2
Scenario: Succesful Login with Orangehrm Valid Creditials
 Given  User Launch the Chrome Browser
 When    User Opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 Then    User Enter the Userfiledname as "Admin" && Passwordfield "admin123"
 And     User Click on the Login button
 When    Page Title should be "OrangeHRM"
 And     User Click on the Userdropdown
 Then    User Select & Click on the Logout button
 
@tag3
Scenario: Succesful Login with HRM Valid Creditials
 Given  User Lauch the Chrome Browser
 When    User Opens the OrangeHrmURL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 And     User Enter the Usernamefield as "Admin" && Passwordfield "admin123"
 Then    User Click on the OrangehrmLogin button
 When    Pagee Title should be "OrangeHRM"
 And     User Click on the My Info
 Then    Userr Click on the Userdropdown
 And     User Click on the HRMLogout button
 
 
 
 