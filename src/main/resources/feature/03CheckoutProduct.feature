Feature: Checkout Two Product

  # negative test

  Scenario: Invalid information without lastname and postal code
    Given Customer click button checkout
    When Customer input firstname
    Then Customer click button continue

  Scenario: Invalid information without firstname and postal code
    Given Customer input lastname
    When Customer click button continue

  Scenario: Invalid information without firstname and lastname
    Given Customer input postal code
    When Customer click button continue

  # negatif Test

  Scenario: Customer Valid Input Information
    Given Customer input valid information
    And Customer click button continue
    When Customer click button finish
    Then Customer click button back home