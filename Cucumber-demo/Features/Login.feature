Feature: To validate login application
@Login
Scenario: To test login with valid credentials
Given  Login application should be launched
When Enter Name, pwd and click submit
Then Login should be successful