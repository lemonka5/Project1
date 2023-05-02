Feature: Browsing into the Demoqa website
#S1:Complete de student registration form
  Scenario: Complete de student registration form
    Given The practice form section from the main page
    When User completes the student registration form
    And Clicks the submit button
    Then Check if student name and email are correct


  #S2:Test the buttons feature from the elements section
  Scenario: Test the buttons feature from the elements section
    Given The buttons feature
    When User performs a double click
    And User performs a right click
    And User performs a left click
    Then Check if the actions were performed correctly
    #S3 Test the browser feature from the alerts section
  Scenario: Test the browser feature from the alerts section
    Given The Browser window feature
    When the user Click on the New tab Button
    And the user Click the New Window Button
    And  the user Click the New Window Message
    Then Check if all the actions were performed correctly

    #S4:Test the auto complete feature from the widgets section
  Scenario: Test the auto complete feature from the widgets section
    Given The auto complete feature from the widgets section
    When User types color Red and Blue in the multiple colors field
    And User types color Black in the Single Color Field
    Then Check if the colors remain imputed on the fields

      #S5--TC1: Test the simple droppable feature from the interactions section
  Scenario:Test the simple droppable feature from the interactions section
    Given The droppable feature from the interactions section
    When Performs the drag and drop action
    Then Check if the action was performed correctly

      #TC2: Test the Accept droppable features from the interaction section
  Scenario:Test the accept droppable feature from the interactions section
    Given The two droppable feature from the interaction section
    When The user perform the drag and drop interaction section
    Then one is dropped and one is not

      #S6: Test the Resizable Feature from Interactions system
  Scenario: Test the restricted Resizable feature from the interactions system
    Given The restricted resizable box
    When user performs the drag operation to maximum size
    Then Check if the element size it's changed

      #S7:Test the sortable feature from the interactions system
  Scenario: Test the sortable list feature from the interactions system
    Given The sortable list feature
    When User drags the One element after the three element
    Then Check if the One element was dragged in the right position

    #S8 Tc1: Test the Alerts feature from the Alert, frame and Windows
  Scenario: Test the simple alert feature from the alert section
    Given The main Alerts page
    When User clicks the simple alert button
    And Close the alert box
    Then Check if alert box is closed

    #S8 Tc2: Test timer Alerts feature from the Alert sectioon
  Scenario: Test the time alert feature from the alert section
    Given The main Alerts page
    When User clicks the timer alert button
    And Close the timer alert box
    Then Check if timer alert box is closed

    #S8 Tc3 : Test Confirm box appear feature from the Alert Section
  Scenario: Test the confirmation box alert feature from the alert section
    Given The main Alerts page
    When User clicks the confirmation box alert button
    And Close the timer confirmation box alert
    Then Check if confirmation box is closed

    #S8-TC4:Test the prompt box feature from the alerts section
    Scenario:Test the prompt box feature from the alerts section
    Given The main Alerts page
      When User clicks the prompt box button
    And User types some random text in the field
    And User closes the prompt box by clicking ok
    Then Check if the prompt box is closed and if text is present

      #S9 Test the Slider Feature from the Widgets section
  Scenario: Test the Slider Feature from the Widgets section
    Given The main Slider Page
    When User moves the slider at 50%
    Then Check if slider is at correct value

    #S10 Test the Progress Bar from the Widgets section
  Scenario: Test the Progress Bar from the Widgets section
    Given The main Progress Bar page
    When User is pressing the Start Button
    And The progress bar is one hundred percent press the reset button
    Then Check if the progress Bar was reset

    #S11: Test the tool tips feature from the widgets section
     Scenario:Test the tool tips feature from the widgets section
      Given The main tool tips page
       When User hovers over the Hover me to see button
      Then Check if "You hovered over the Button" message is displayed

       #S12 TC1: Test the login feature from the Book Store Section
    Scenario: Test the login feature from the Book Store Section
      Given The main Login page
      When User register on the Book Store
      Then User login with registered account

      #S12 TC2: Test the Search feature from the Book Store Section
  Scenario: Test the Search feature from the Book Store Section
    #Given The main Book Store page
    Given The main Login page
    When  User searched a book
    Then Check if the book was find it