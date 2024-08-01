Feature: Login

@tag1
Scenario: Successful Login with Valid Credentials
 Given  User Launch the Chrome Browser1
 When    User Opens the URL "https://www.irctc.co.in/nget/train-search"
 Then    User Click on the Login button
 And     Userr Enter thee Username as "srbhanusr" && Password "Sr786bhanu786"
 Then    User Click on the Signin button
 When    Page Title should be "IRCTC Next Generation eTicketing System"
 And     User Click on the Logout button
 
 

#Feature: The purpose of the Feature keyword is to provide a high-level description of a software feature, and to group related scenarios.
#Scenario: In addition to being a specification and documentation, a scenario is also a test. As a whole, your scenarios are an executable specification of the system.
#Given: steps are used to describe the initial context of the system – the scene of the scenario. It is typically something that happened in the past.
#When: steps are used to describe an event, or an action. This can be a person interacting with the system, or it can be an event triggered by another system.
#Then: steps are used to describe an expected outcome, or result.
#Scenario Outline: This keyword can be used to run the same Scenario multiple times, with different combinations of values.
#Background: It allows you to add some context to the scenarios in the feature. It can contain one or more Given steps.

      
      
      
      
      
      
      
      
      
      
      
      
      
