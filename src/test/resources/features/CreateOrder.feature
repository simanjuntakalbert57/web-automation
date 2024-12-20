Feature: Purchase the order from the ecommerce


Background: Buyer Landed to website
    Given Buyer landing to ecommerce 

Scenario Outline: Create Order positive case
    Given Buyer logged to website email <email> and password <password>
    When I add product <product> to Create
    And I checkout <product> and submit order
    Then "THANKYOU FOR THE" message is displayed on confirmation page

    Examples:
    |email                         |password         | product      |
    |simanjuntakalbert57@gmail.com | XBf@rWNvByn!#K8 |ZARA COAT 3   |
    # |simanjuntakalbert57@gmail.com | XBf@rWNvByn!#K8 |ADIDAS ORIGINAL   |

Scenario: Order History
