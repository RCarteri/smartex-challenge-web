@login
Feature: Login

    Background:
        Given I access the login page

    @login-CT001 @smoke @regression
    Scenario: CT001 - Login
        When I fill in the login form
        Then the item My Dashboard should appear in the header of the page
