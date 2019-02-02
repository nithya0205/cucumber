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
Feature: Input Form Demo
  I want to use this template for my feature file

  @tag1
  Scenario: To Submit the Input Form
    Given User to go to Selenium Easy Home Page 
    And User to click the Input form DropDown and navigate to Input Form Demo
    When Fill the Required details
    |Nithya|Subbu|nits@gmail.com|9790979988|Adyar|Chennai|daho|600028|.com|My Project|
    And Click submit Button
    Then User to Quit the Browswer

