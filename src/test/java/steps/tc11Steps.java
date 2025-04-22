package steps;

import org.openqa.selenium.WebDriver;
import pages.tc11Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc11Steps {

    WebDriver driver;
    tc11Page historialPage;

    @Given("el usuario está en la página principal")
    public void el_usuario_está_en_la_página_principal() {
        // Aquí se inicializaría el driver y se abriría la página principal
        historialPage = new tc11Page(driver);
    }

    @When("el usuario navega a la sección de historial de compras")
    public void el_usuario_navega_a_la_sección_de_historial_de_compras() {
        historialPage.irAHistorialDeCompras();
    }

    @Then("se muestra el historial de compras del usuario")
    public void se_muestra_el_historial_de_compras_del_usuario() {
        historialPage.verificarHistorialDeComprasVisible();
    }
}