Feature: Recruitment Page Test
  Scenario: User successful add candidate
    Given User already login with valid credential
    And User click recruitment button
    And User click button add
    And User enter valid first name
    And User enter valid middle name
    And User enter valid last name
    And User enter vacancy
    And User enter valid email address
    And User enter valid email password
    And User enter document
    And User enter job keyword
    And User enter dates
    And User click the consent data checkbox
    And User click the save button
    Then User can see the successful update message