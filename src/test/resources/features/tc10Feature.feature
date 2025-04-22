Feature: Eliminar Cuenta

  Scenario: Eliminar cuenta de usuario
    Given El usuario está autenticado y en la página de perfil
    When accede a la opción de eliminación de cuenta y la confirma
    Then la cuenta se elimina del sistema con éxito