@login
Feature: Login

    Background:
        Given I access the login page

    @login-CT001 @smoke @regression
    Scenario: CT001 - Login
        When I fill in the login form
        Then the item My Dashboard should appear in the header of the page

    @login-CTE001
    Scenario Outline: CTE001 - Login exception
        When I fill in the login form with the data email "<email>" and password "<password>"
        Then the error message "<errorMessage>" should appear in the page
        Examples:
            | email   | password | errorMessage               |
            |         |          | Invalid email or password. |