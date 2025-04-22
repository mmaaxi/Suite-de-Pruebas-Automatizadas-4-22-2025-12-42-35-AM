Feature: Agregar Producto al Carrito

  Scenario: Agregar un producto al carrito
    Given el usuario está en la página del catálogo de productos
    When el usuario selecciona un producto y hace clic en "Agregar al carrito"
    Then el producto se añade correctamente al carrito