Feature: Verify Email and password

  Scenario Outline: Verify REST API Get call for a booking

    Given Verify using "<url>" and "<booking>" and making a get Request
    Then  Response code "<response>" status is fetched
    Examples:
      | url | booking | response |
    |     /booking| 3635  |    200          |


