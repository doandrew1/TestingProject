@g15
  Feature:Add to wishlist
    Scenario: user add to wishlist
      When User click on  the wishlist button
      Then Chick if The product has been added to your wishlist

    Scenario: check the wishlist
      When User click on  the wishlist button fot sec time
      And Click on  wishlist on the top
      Then  Quantity > Zero