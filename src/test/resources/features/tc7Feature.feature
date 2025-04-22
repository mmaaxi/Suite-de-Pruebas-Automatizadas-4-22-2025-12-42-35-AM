Feature: Cerrar Sesión
  Como usuario, quiero cerrar sesión para asegurar mi cuenta.

  Scenario: Usuario hace clic en 'Cerrar sesión'
    Given el usuario está autenticado
    When el usuario hace clic en 'Cerrar sesión'
    Then el usuario es redirigido a la página principal
    And el usuario es desconectado