@register
Feature: Register a user

    Background:
        Given I access the login page
        And I access the registration page

    @register-CT001 @smoke @regression
    Scenario Outline: CT001 - Create a new user
        When I fill in the form to create a new user with the data first name "<firstName>", last name "<lastName>", email "<email>" and password "<password>"
        Then the item My Dashboard should appear in the header of the page
        Examples:
            | firstName | lastName | email                | password   |
            | Paulo     | Silva    | paulosilva@gmail.com | paulosilva |

    @register-Ex001
    Scenario Outline: Create a new user exception
        When I fill in the form to create a new user with the data first name "<firstName>", last name "<lastName>", email "<email>" and password "<password>"
        Then the error message "<errorMessage>" should appear in the page
        Examples:
            | firstName | lastName | email            | password | errorMessage                                                                                    |
            |           |          |                  |          | First name can't be blank/Last name can't be blank/Email can't be blank/Password can't be blank |
            | Pedro     | Souza    | 123.com          | 12345678 | Email is invalid                                                                                |
            | Carlos    | Silva    | carlos@gmail.com | 123      | Password must be at least 8 characters.                                                         |