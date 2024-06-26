Feature: Feature to test the calculator functionality
  

  @smoke
  Scenario: div numbers from table
    Given I open calculator
    
    When I div <val1> by <val2>
   
    Then I should get div result <res>

  

    Examples: 
      | val1  | val2 | res  |
      | 100 |     5 | 20 |
      | 200 |     2 | 100    |
