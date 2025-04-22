package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc9Page {

    WebDriver driver;

    public tc9Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nombre")
    WebElement nombreInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "guardarCambios")
    WebElement guardarCambiosButton;

    @FindBy(id = "mensajeConfirmacion")
    WebElement mensajeConfirmacion;

    public void navegarAPaginaDePerfil() {
        driver.get("https://www.example.com/perfil");
    }

    public void editarInformacionDePerfil(String nombre, String email) {
        nombreInput.clear();
        nombreInput.sendKeys(nombre);
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void guardarCambios() {
        guardarCambiosButton.click();
    }

    public void verificarActualizacionDeInformacion(String nombre, String email) {
        // Asegúrate de que la página actual mostró un mensaje de confirmación
        assert(mensajeConfirmacion.isDisplayed());
        // Aquí podrías agregar más validaciones según la implementación del sistema
    }
}