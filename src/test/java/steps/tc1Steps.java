package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc1Page;
import static org.junit.Assert.assertTrue;

public class tc1Steps {
    
    tc1Page loginPage = new tc1Page();

    @Given("el usuario accede a la página de login")
    public void el_usuario_accede_a_la_pagina_de_login() {
        loginPage.navigateToLoginPage();
    }
    
    @Then("se muestra el formulario de login")
    public void se_muestra_el_formulario_de_login() {
        assertTrue("El formulario de login no es visible", loginPage.isLoginFormVisible());
    }
}