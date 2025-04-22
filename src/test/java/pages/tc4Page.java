package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc4Page {

    WebDriver driver;

    By productoSelector = By.cssSelector(".product-item");
    By agregarCarritoButton = By.cssSelector(".add-to-cart-btn");
    By carritoIcon = By.cssSelector(".cart-icon");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarProducto() {
        driver.findElement(productoSelector).click();
    }

    public void agregarAlCarrito() {
        driver.findElement(agregarCarritoButton).click();
    }

    public boolean isProductoEnCarrito() {
        // Lógica para verificar si el producto está en el carrito
        return driver.findElement(carritoIcon).getText().contains("1");
    }
}