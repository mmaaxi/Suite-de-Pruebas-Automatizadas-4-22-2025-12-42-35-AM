package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc3Page;

public class tc3Steps {

    WebDriver driver;
    tc3Page productPage;

    @Given("el usuario está en la página de inicio")
    public void el_usuario_está_en_la_página_de_inicio() {
        // Inicializar el navegador y abrir la página de inicio
        productPage = new tc3Page(driver);
        productPage.openHomePage();
    }

    @When("el usuario busca un producto específico llamado {string}")
    public void el_usuario_busca_un_producto_específico_llamado(String productName) {
        productPage.enterSearchQuery(productName);
    }

    @Then("se muestra una lista de productos relacionados")
    public void se_muestra_una_lista_de_productos_relacionados() {
        Assert.assertTrue("No se encontró una lista de productos relacionados.", productPage.isProductListDisplayed());
    }
}