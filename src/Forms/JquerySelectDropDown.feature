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
Feature: JQuery Drop Down
  I want to use this template for my feature file

  @tag1
  Scenario: To Verify JQuery Drop Down
    Given User to go to Selenium Easy Home Page
    And User to click the Input form DropDown and navigate to JQuery Select Drop Down Page
    When User to select India under DropDown with Search Box Section
    And User to Select the Option Ohio and Texas under Multiselect List 
    And User to Select the Option American Samoa under Drop Down Disabled 
    And User to Select the Option Java under Drop-down with Category related options
    Then Quit Browser 

  
