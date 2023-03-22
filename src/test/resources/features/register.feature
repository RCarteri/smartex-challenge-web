@S001
Feature: Register a user

    Background:
        Given that the site is closed open the site
        And I access the login page
        And I access the registration page

    @S001-CT001 @Smoke @Regression
    Scenario Outline: CT001 - Create a new user
        When I fill in the form to create a new user with the data first name "<firstName>", last name "<lastName>", email "<email>" and password "<password>"
        Then the message "My Dashboard" should appear in the header of the page
        Examples:
            | firstName | lastName | email                 | password   |
            | Paulo     | Silva    | paulo.silva@gmail.com | paulosilva |

    @S001-CT002
    Scenario Outline: Create a new user exception
        When I fill in the form to create a new user with the data first name "<firstName>", last name "<lastName>", email "<email>" and password "<password>"
        Then the error message "<errorMessage>" should appear in the page
        Examples:
            | firstName | lastName | email   | password | errorMessage                                                                                    |
            |           |          |         |          | First name can't be blank/Last name can't be blank/Email can't be blank/Password can't be blank |
            |           |          | 123.com |          | Email is invalid                                                                                |
            |           |          |         | 123      | Password must be at least 8 characters.                                                         |