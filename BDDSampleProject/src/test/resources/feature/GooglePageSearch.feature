Feature: Google Page Search Function

  Scenario: Search Java Tutorial
  
    Given User is on Google Page
   
    When I search Java tutorial
    
    Then Should display Java Tutorial releated Search Data
