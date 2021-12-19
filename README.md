# https://www.saucedemo.com Testing

## About

https://www.saucedemo.com Commercial project with the following functions: authorization, go to the home page, add a product to the cart and place an order.

Using: Selenium Framework, Java , Junit
## Tests
LoginPageTests:
 - Tests the entry through the authorization fields: login and password.
 - Tests login without authorization
 
HomePageTests:
- Should counts of product on Home page
- Should show title of products
- Should to show Home page after logout

CartPageAndCheckoutOrderTest:
- Should adding product to Cart page and close order after fill form about customer

FiltersTest:
- Checking on the main page of the products for the possibility to choose filtering from the largest to the smallest. Then we check that the first product has the required tag name.
