#Author: Jhonatan Paternina Rojas
@page1
Feature: As a candidate of evalart I want to enter the website to create the test

  Scenario Outline: validate that the test performs the ten cycles
    Given that the user is on the evalart home page
      | username   | password   |
      | <username> | <password> |
    When carry out the proposed operations
    Then validate that the response is successful
      | hash   |
      | <hash> |
    Examples:
      | username | password                                         | hash                                                      |
      | 831537   | 10df2f32286b7120MS00LTczNTEzOA==30e0c83e6c29f1c3 | <General>c2fe0e21ce445033MS00LTczNTEzOA==df63afbf4da3d4b1 |