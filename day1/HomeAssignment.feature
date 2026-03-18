Feature: Account creation is success
Scenario: Account creation is success

Given Launch the browser
Given  Launch the Url
When Click on toggle menu button from the left corner

When Click view All and click Sales from App Launcher
When Click on Accounts tab
When Click on New button
When Enter the name as account name
When Select Ownership
When Click save
Then Account created with name successful