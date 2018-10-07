Feature: Reset the User Credentials in Facebook

Scenario Outline: Verify the reset functionality

Given Open Chrome and launch Facebook

When Enter the <Username> and <Password>

Then Reset the values

Examples:
|Username||Password|
|"User 1"||"Password 1"|
|"User 2"||"Password 2"|