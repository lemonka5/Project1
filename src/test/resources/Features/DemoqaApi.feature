Feature: Calling the rest api in Demoqa Book Store App

  #S1: User logs in to the account
  Scenario: User logs in to the Book Store app
    Given The Book Store Api page
    When User logs in to the account
    Then Check if user is logged in with valid credentials

    #S2: User displays all the books available
  Scenario: User gets the books available in the book store
    Given The Book Store page
    When User displays all the books
    Then Check if all the books were displayed

    #S3: Create a new user
  Scenario: Create a new user
    Given The Book Store Api page
    When A new user is created
    Then Check if the user was created

    #S4: Delete user
  Scenario: Delete user
    Given The Book Store Api page
    When A user is deleted
    Then  Check if the user was deleted

    #S5: Add a book to cart
  Scenario: Add a book to cart
    Given The Book Store Api page
    When The user adds a book to cart
    Then Check if the book was added to cart

    #S6: Delete a book from cart
  Scenario: Delete a book from cart
    Given The Book Store Api page
    When The user delete a book from cart
    Then  Check if the book was deleted

    #S7: Change the book on cart
  Scenario: Change the book from cart
    Given The Book Store Api page
    When The user change the book on cart
    Then Check if the book was changed