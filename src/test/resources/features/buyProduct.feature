Feature: Buy product
  Scenario: Buy product Sauce Lab Back Packs with blue color and 2 items quantity
    Given User Open Application
    When Verify The Application Opened
    And User Choose Product Sauce Lab Back Packs
    Then Verify Redirect To Detail Product Page
    And User Choose Blue Color
    Then Verify The Color is selected
    And User Increase Quantity to two items
    Then Verify Quantity Increase
    And User Click Button Add to Cart
    Then Verify Product added to cart
    And User Navigate to Cart Page
    Then Verify Redirect to Cart Page
    And User Click Button Process to Checkout
    Then Verify Redirect to login page
    And user Login
    Then Verify Redirect to Checkout Page
    And User input all form checkout information
    And User Click Button Payment
    Then Verify Redirect to form payment method
    And User input all form payment method
    And user click button review order
    Then Verify Redirect to Review Order page
    And User click button place order
    Then Verify status Checkout Complete