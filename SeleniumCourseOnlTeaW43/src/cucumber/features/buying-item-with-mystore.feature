Feature: Buying item with mystore

  Scenario Outline: Buying item after login at MyStore website
    Given Page MyStore opened in browser
    When User is signed in and item is found
    And Size M is chosen
    And Quantity '<pieces>' is chosen
    Then Product is successfully added to cart
    And Address, Delivery, payment options are confirmed
    And Screenshot is done

    Examples:
    |pieces|
    |5     |
