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
Feature: Simple Form Demo
  I want to use this template for my feature file

  @tag1
  Scenario: To Validate the Simple Form
    Given User to go to Selenium Easy Home Page
    And User to click the Input form DropDown and navigate to Simple Form
    When Enter the Value Single input Field 
    |Nithya|
    And Enter the value Two Input Field
    |1|5|
    Then User validate the outcomes of Single Input Field Entery
    And User validate the outcomes of Two Input Field Entery
    And User quit the Browser

