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
Feature: Check Box Demo
  I want to use this template for my feature file

  @tag1
  Scenario: Validate the Check Box Demo Page
    Given User to go to Selenium Easy Home Page 
    And User to click the Input form DropDown and navigate to Check Box Demo
    When check the Single checkbox Field
    And check the multiple checkbox Field
    Then click checkAll button to select all the option
    And validate the Single checkbox field
    And User Quit the Browser
    
    

