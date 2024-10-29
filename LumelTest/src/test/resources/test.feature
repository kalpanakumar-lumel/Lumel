
@tag
Feature: Verify the Todos list-to-do items

  @tag1
  Scenario: Verify it allow to Add in the list
    Given Check allowing to enter data in list
    And Check allowing to add data in list
    When Check listing the added data


  @tag2
  Scenario Outline: Verify it allow to mark completed
    Given Check allowing to select data in list
    
   @tag3
  Scenario Outline: Verify it allow to delete data from list
    Given Check allowing to delete Clean the house data from list


    