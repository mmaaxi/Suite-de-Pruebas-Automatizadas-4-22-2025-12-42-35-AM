Feature: Recuperar Contraseña

  Scenario: Usuario quiere recuperar su contraseña
    Given El usuario está en la página de inicio de sesión
    When El usuario selecciona la opción 'Recuperar contraseña'
    And Ingresa su email "usuario@example.com"
    Then Se debe enviar un correo para la recuperación de contraseña