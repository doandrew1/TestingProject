@g15
Feature: Users can search on there products
  Scenario:  user could search using product name
    When  The user enter the product "book"
    And   The press on the search bottom
    Then  results must be shown


  Scenario: user could search for product using sku
   When The user enter the product "SCI_FAITH"
   And The press on the search bottom
   And click on the product
   Then Results must be shown secoundly