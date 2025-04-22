package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc11Page {

    WebDriver driver;

    By historialComprasLink = By.id("historial-compras");
    By historialComprasSection = By.id("seccion-historial");

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    public void irAHistorialDeCompras() {
        WebElement link = driver.findElement(historialComprasLink);
        link.click();
    }

    public void verificarHistorialDeComprasVisible() {
        WebElement section = driver.findElement(historialComprasSection);
        Assert.assertTrue("El historial de compras no es visible", section.isDisplayed());
    }
}