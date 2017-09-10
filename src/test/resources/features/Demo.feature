@test
Feature: Calculations

Background Given user open calculator

Scenario Outline: Addition
    When user press ADD button <count> times
    Then the result should be <count>

Examples:
	| count |
	| 1		|
	| 3		|

Scenario Outline: Subtraction
    When user press SUBTRACT button <count> times
    Then the result should be <result>

Examples:
	| count | result |
	| 1		| -1	 |
	| 3		| -3	 |