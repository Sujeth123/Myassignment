Feature: Verify the User able to create multiple  accounts

Scenario Outline: Verify the User able to create multiple  accounts

Given Login to Salesforce with userID and Pwd
Given Click on App Launcher icon
When Click on the Accounts tab
When Click on the New button
When Enter your name as account name <AccountName>
When Select Ownership <Ownership>
When Click on Save button
Then Verify the Account Name <AccountName>

Examples:
|AccountName|Ownership|
|'Geetha'|'Public'|
|'Sujeth'|'Private'|
|'Mahashree'|'Subsidiary'|
|'Amma'|'Other'|