Feature: Registro de Usuario

  Scenario: Usuario ingresa datos en el formulario de registro
    Given El usuario está en la página de registro
    When El usuario ingresa los datos en el formulario de registro
    Then Se crea un nuevo usuario