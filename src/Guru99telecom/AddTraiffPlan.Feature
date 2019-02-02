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
Feature: Customer To Add Tariff Plan
  @tag1
  Scenario: To Add Traiff Plan to customer
    Given The User in GuruHome Page
   And The User Navigate to Add Traiff plan
    When The User to fill the Details
    |250|400|25|35|35|100|25|
    And The User click the Submit button
    Then The User validate the outcome
