#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Payment Gateway

Background: To Generate Card Details
Given User to go to GurupaymentGateway Page
And User to click Generate Card number option
Then Store the Card details.
And  User to click cart
@first
Scenario: To Buy the item in Payment Gateway 
Given User to click on Buy now
When User to enter the card details
And  Click on the Payment button
Then User to verify the payment successful message
@second
Scenario: To Check the Credit card balance
Given User to click on Check the Credit tab
When User to enter the card number
And  Click on the Submit Button
Then User to check Card balance amount

