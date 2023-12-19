Feature: Quadient Login

@tag4
Scenario: Quadient Login Successful With Valid Creditials
Given Custmer Launch the Browser
When  Custmer Open the Browser URL "https://fa-etkq-dev3-saasfaprod1.fa.ocs.oraclecloud.com/"
And   Custmer Enter the UserID as "r.kambham@quadient.com" && Passwrd as "WELCOME1"
Then  Custmer Clicks the Signin button
And   Custmer Click on the Home icon
#Then  HomePage was displayed Pagetitle as ""
When  Custmer Clicks the Settings and Actions icon
Then  Custmer Click on the SignOut link
And   Custmer Click on the Confirm button


