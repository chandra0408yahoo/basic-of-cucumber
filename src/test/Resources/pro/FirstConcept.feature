Feature: This is first cucumber concept file


  Scenario: This is first scenario
    Given This is login


  @one
  Scenario: This is with example parameters
    Given This is login as "user"


  Scenario: for datatable

    Given this is example for data table
      | this is for testing |


  Scenario Outline: test scenario outline which is used for repetition

    Given this testing puropse is "<username>"

    Examples:
      | username  |
      | useralpha |
      | userbeta  |


    Scenario: test api scripts
      Given i try to do api test