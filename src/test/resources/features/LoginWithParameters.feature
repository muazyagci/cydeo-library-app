@wip
Feature:  Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page

    @librarian
    Scenario: Login as librarian
      When user enters librarian username "librarian1@library"
      And  user enters librarian password "qU9mrvur"
      Then user should see the dashboard

      @student
      Scenario: Login as student
        When user enters student username "student4@library"
        And user enters student password "pG3V6qaL"
        Then user should see the dashboard