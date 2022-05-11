Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home Page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then   I verify that the logo is present on the page
    And close browser


