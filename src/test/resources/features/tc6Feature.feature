Feature: Ver Perfil de Usuario

  Scenario: Navegar a la sección de perfil de usuario y mostrar la información del perfil
    Given el usuario está autenticado en la aplicación
    When navega a la sección de perfil de usuario
    Then se muestra la información del perfil correctamente