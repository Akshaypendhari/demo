Feature: Opening Webpage

  Scenario Outline: Testing webpage working or not
    Given User is on facebook login page "<url>"
    When User enter Username  "<username>"
    And User enter password "<password>"
    And User click on login button
    

   Examples: 
     | url                       | username | password |
      | https://www.facebook.com/ | Akshay   | Pendhari |
     