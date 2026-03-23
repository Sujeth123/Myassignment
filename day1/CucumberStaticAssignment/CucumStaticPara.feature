Feature: Verify the User able to update the accounts

Scenario: Verify the User able to update the accounts

Given Login to Salesforce
Given Click on App Launcher
When Select Accounts
When Search for the account
When Click the dropdown icon next to the account and select Edit
When Enter a unique number in the Phone field '8825687489'
When Set Type to Technology Partner
When Set Industry to Healthcare
When Enter the Billing Address 'India' and '1st street' and 'Chennai' and 'Tamil Nadu'
When Set Customer Priority to Low
When Enter the Shipping Address
When Set SLA to Silver
When Set Active to NO
When Set Upsell Opportunity to No
When Click on Save
Then Verify the Phone Number '8825687489'