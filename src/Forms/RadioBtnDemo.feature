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
Feature: Radio Button Demo Form
  @tag1
  Scenario: Validate the Radio Button Demo Page
    Given User to go to Selenium Easy Home Page 
    And User to click the Input form DropDown and navigate to Radio Button Demo
    When Click the Radio Button Male under Radio Button Demo
    And Click the Radio Button Female and age Group as 15 to 50 under Group Radio Button Demo
    Then validate the outcomes by clicking get checked value Buuton under radio Demo section
    And validate the outcomes by clicking get value Buuton under group radio Demo section

  