Feature: Test vtiger login functionality

Scenario Outline: Test Valid and invalid Login 
Given user need to navigate on vtiger website
And enter user id as "<Username>" and password as "<Password>"
Then Logout link should be appered on home page

Examples:
|Username|Password|
|admin   |admin   |
|admin   |admin   |
|admin   |admin   |






