@test
Feature: Addition

Background Given user open calculator

Scenario: Add number
    When user press ADD button
    Then the result should be increased by 1