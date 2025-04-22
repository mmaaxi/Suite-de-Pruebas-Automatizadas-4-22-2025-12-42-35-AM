package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc7Page {
    WebDriver driver;

    @FindBy(id = "logoutButtonId")
    WebElement logoutButton;

    @FindBy(id = "homePageIdentifier")
    WebElement homePageIdentifier;

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public boolean isAtHomePage() {
        // Implementar la lógica para verificar si estamos en la página principal
        return homePageIdentifier.isDisplayed();
    }

    public boolean isAuthenticated() {
        // Implementar la lógica para verificar si el usuario está autenticado
        return true; // Suponiendo autenticación exitosa
    }

    public boolean isLoggedOut() {
        // Implementar la lógica para verificar si el usuario está desconectado
        return !isAuthenticated(); // Suposición: autenticación fallida significa deslogueado
    }
}