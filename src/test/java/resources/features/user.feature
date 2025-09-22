Feature: Listar usuários

  Scenario: Listar todos os usuários
    Given que existem usuários cadastrados
    When eu faço uma requisição GET para obter usuários
    Then a resposta deve ter o status code 200
    And a resposta deve conter uma lista de usuários