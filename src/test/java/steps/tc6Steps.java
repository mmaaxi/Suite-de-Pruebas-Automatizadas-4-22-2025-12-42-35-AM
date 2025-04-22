package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc6Page;
import static org.junit.Assert.*;

public class tc6Steps {

    WebDriver driver;
    tc6Page profilePage;

    public tc6Steps() {
        // Inicialización del driver (se asume que el código relevante para iniciar sesión está aquí)
        // driver = ... 
        profilePage = PageFactory.initElements(driver, tc6Page.class);
    }

    @Given("el usuario está autenticado en la aplicación")
    public void el_usuario_esta_autenticado_en_la_aplicacion() {
        // Código para autenticar al usuario
        // Se debe manejar ya sea la autenticación o asumir que el usuario ya está autenticado
    }

    @When("navega a la sección de perfil de usuario")
    public void navega_a_la_seccion_de_perfil_de_usuario() {
        profilePage.goToUserProfile();
    }

    @Then("se muestra la información del perfil correctamente")
    public void se_muestra_la_informacion_del_perfil_correctamente() {
        assertTrue(profilePage.isProfileInfoDisplayed());
    }
}