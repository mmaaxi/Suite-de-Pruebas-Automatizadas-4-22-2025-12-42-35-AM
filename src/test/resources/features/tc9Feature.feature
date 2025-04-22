Feature: Actualizar Información del Usuario

  Scenario: El usuario edita su información de perfil y guarda los cambios
    Given el usuario ha iniciado sesión y está en la página de perfil
    When el usuario edita su información de perfil
    And guarda los cambios
    Then la información del usuario se actualiza correctamente