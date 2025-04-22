package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc10Page {
    WebDriver driver;

    By eliminarCuentaOpcion = By.id("eliminarCuenta");
    By confirmarEliminacionBoton = By.id("confirmarEliminacion");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProfilePage() {
        // Lógica para navegar a la página de perfil del usuario
    }

    public boolean isUserAuthenticated() {
        // Lógica para verificar que el usuario está autenticado
        return true;
    }

    public void clickEliminarCuentaOpcion() {
        driver.findElement(eliminarCuentaOpcion).click();
    }

    public void confirmarEliminacion() {
        driver.findElement(confirmarEliminacionBoton).click();
    }

    public boolean isCuentaEliminada() {
        // Lógica para verificar que la cuenta ha sido eliminada
        return true;
    }
}