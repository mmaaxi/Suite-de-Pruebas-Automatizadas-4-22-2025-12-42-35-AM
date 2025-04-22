package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc10Page;
import org.junit.Assert;

public class tc10Steps {
    WebDriver driver;
    tc10Page eliminarCuentaPage;

    @Given("El usuario está autenticado y en la página de perfil")
    public void elUsuarioEstaAutenticadoYEnLaPaginaDePerfil() {
        // Inicializar el driver y navegar a la página de perfil
        eliminarCuentaPage = new tc10Page(driver);
        eliminarCuentaPage.navigateToProfilePage();
        Assert.assertTrue(eliminarCuentaPage.isUserAuthenticated());
    }

    @When("accede a la opción de eliminación de cuenta y la confirma")
    public void accedeALaOpcionDeEliminacionDeCuentaYLaConfirma() {
        eliminarCuentaPage.clickEliminarCuentaOpcion();
        eliminarCuentaPage.confirmarEliminacion();
    }

    @Then("la cuenta se elimina del sistema con éxito")
    public void laCuentaSeEliminaDelSistemaConExito() {
        Assert.assertTrue(eliminarCuentaPage.isCuentaEliminada());
    }
}