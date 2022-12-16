Feature: Login
  Background:
    Given I open portal PASTI
    When I fill in username "m.dummy.b1"

    @login.sukses @sanity
  Scenario: Login Successfully
    Then I fill in password "Honda2020!"
    And I click login button
    And I should see "Announcement" text
#
#  Scenario: Login failed using invalid password
#    Then I fill in "Honda" as password
#    And I click login button
#    And I should see "Invalid username/password" text

  @smoke @sanity
    Scenario Outline: Login scenario
      Then I fill in "<password>" as password
      And I click login button
      And I should see "<textValidation>" text
      Examples:
        | password   | textValidation              |
        | Honda2020! | Announcement                |
        | password   | Invalid username / password |

