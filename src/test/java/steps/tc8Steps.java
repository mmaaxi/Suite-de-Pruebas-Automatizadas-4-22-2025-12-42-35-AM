package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc8Page;

public class tc8Steps {

    private WebDriver driver;
    private tc8Page page;

    public tc8Steps() {
        // Initialize WebDriver instance here (e.g., using Selenium WebDriver, etc.)
        driver = // WebDriver initialization;
        page = PageFactory.initElements(driver, tc8Page.class);
    }

    @Given("El usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver.get("https://www.example.com/login");
    }

    @When("El usuario selecciona la opción 'Recuperar contraseña'")
    public void elUsuarioSeleccionaLaOpcionRecuperarContrasena() {
        page.clickRecuperarContrasenaLink();
    }

    @When("Ingresa su email {string}")
    public void ingresaSuEmail(String email) {
        page.enterEmail(email);
    }

    @Then("Se debe enviar un correo para la recuperación de contraseña")
    public void seDebeEnviarUnCorreoParaLaRecuperacionDeContrasena() {
        page.verifyEmailSent();
    }
}