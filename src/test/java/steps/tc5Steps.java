package steps;

import pages.tc5Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc5Steps {
    private tc5Page purchasePage = new tc5Page();

    @Given("el usuario está en la página de pago")
    public void el_usuario_esta_en_la_pagina_de_pago() {
        purchasePage.navigateToPaymentPage();
    }

    @When("el usuario completa los datos de pago y confirma la compra")
    public void el_usuario_completa_los_datos_de_pago_y_confirma_la_compra() {
        purchasePage.enterPaymentDetails("John Doe", "4111111111111111", "12/23", "123");
        purchasePage.confirmPurchase();
    }

    @Then("la compra se realiza de manera exitosa")
    public void la_compra_se_realiza_de_manera_exitosa() {
        assertTrue(purchasePage.isPurchaseSuccessful());
    }
}