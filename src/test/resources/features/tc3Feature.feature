Feature: Búsqueda de Productos

  Scenario: Buscar un producto específico
    Given el usuario está en la página de inicio
    When el usuario busca un producto específico llamado "Auriculares"
    Then se muestra una lista de productos relacionados