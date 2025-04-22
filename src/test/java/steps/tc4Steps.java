package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc4Page;

public class tc4Steps {

    WebDriver driver = new ChromeDriver();
    tc4Page productPage = new tc4Page(driver);

    @Given("el usuario está en la página del catálogo de productos")
    public void elUsuarioEstáEnLaPáginaDelCatálogoDeProductos() {
        driver.get("http://example.com/products");
    }

    @When("el usuario selecciona un producto y hace clic en \"Agregar al carrito\"")
    public void elUsuarioSeleccionaUnProductoYHaceClicEnAgregarAlCarrito() {
        productPage.seleccionarProducto();
        productPage.agregarAlCarrito();
    }

    @Then("el producto se añade correctamente al carrito")
    public void elProductoSeAñadeCorrectamenteAlCarrito() {
        Assert.assertTrue(productPage.isProductoEnCarrito());
        driver.quit();
    }
}