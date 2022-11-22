@tag
  Feature: DivisionSqrt
    Scenario: square root of two numbers division
      Given Two values, 24 and 6
      When I divide and get the sqrt the two values
      Then I expect the result to be 2

      Scenario Outline: square root of two numbers division
        Given Two values, <a> and <b>
        When I divide and get the sqrt the two values
        Then I expect the result to be <result>
        Examples:
          | a  | b  | result |
          | 4  | 1  | 2      |
          | 36 | 4  | 3      |
          | 36 | -1 | -1     |