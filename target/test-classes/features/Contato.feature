Feature: Check the Contato page

  Background:
    Given User access the Dextra website

    Scenario: User
      Given User clicks on Blog menu button
      And User clicks on Testes automatizados no Android article
      And User checks the "ENTRE EM CONTATO" form
      When User clicks on Submit button

  Scenario: User
    Given User clicks on Blog menu button
    And User clicks on Testes automatizados no Android article
    And User checks the "ENTRE EM CONTATO" form
    And User insert "Test Dextra" as name
    And User insert "test@dextra.com" as email
    And User insert "(11) 9999-0000" as phone number
    And User insert "Testing Dextra website" as message
    When User clicks on Submit button
    Then User checks the message "Please verify that you are not a robot."

  Scenario: User
    Given User clicks on Blog menu button
    And User clicks on Testes automatizados no Android article
    And User checks the "ENTRE EM CONTATO" form
    And User insert "Test Dextra" as name
    And User insert "test@dextra.com" as email
    And User insert "(11) 9999-0000" as phone number
    And User insert "Testing Dextra website" as message
    And User clicks on Nao sou um robo button
    When User clicks on Submit button


