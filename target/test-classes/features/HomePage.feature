Feature: Test the Home Page from Dextra website

  Background:
    Given User access the Dextra website

    Scenario: User search a keyword on website
      Given User clicks on Search icon button
      When User enters "test" on search field
      Then User press Enter key

    Scenario: User check the  business cases
      Given User clicks on Conheça nossos Cases button
      And User clicks on Carregar Mais button
      When User clicks on App Show do Milhão
      Then User checks the text "Devido à penetração do SBT entre os brasileiros, da força da marca e da audiência do apresentador Silvio Santos, o jogo tem o potencial de atingir milhões de usuários em todo o Brasil, em pouquíssimo tempo."


