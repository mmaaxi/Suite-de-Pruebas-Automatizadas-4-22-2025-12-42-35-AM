Feature: Ver Historial de Compras

  Scenario: Usuario navega al historial de compras
    Given el usuario está en la página principal
    When el usuario navega a la sección de historial de compras
    Then se muestra el historial de compras del usuario