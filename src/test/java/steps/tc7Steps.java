package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc7Page;
import static org.junit.Assert.assertTrue;

public class tc7Steps {
    WebDriver driver;
    tc7Page page;

    public tc7Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc7Page.class);
    }

    @Given("el usuario está autenticado")
    public void el_usuario_está_autenticado() {
        // Aquí se puede añadir la lógica para autenticarse, en caso de ser necesario
        assertTrue(page.isAuthenticated());
    }

    @When("el usuario hace clic en 'Cerrar sesión'")
    public void el_usuario_hace_clic_en_cerrar_sesión() {
        page.clickLogoutButton();
    }

    @Then("el usuario es redirigido a la página principal")
    public void el_usuario_es_redirigido_a_la_página_principal() {
        assertTrue(page.isAtHomePage());
    }

    @Then("el usuario es desconectado")
    public void el_usuario_es_desconectado() {
        assertTrue(page.isLoggedOut());
    }
}