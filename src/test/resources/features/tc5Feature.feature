Feature: Proceso de Compra

  Scenario: Realizar compra completando datos de pago
    Given el usuario está en la página de pago
    When el usuario completa los datos de pago y confirma la compra
    Then la compra se realiza de manera exitosa