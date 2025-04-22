package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import pages.tc9Page;
import io.cucumber.java.en.*;

public class tc9Steps {

    WebDriver driver;
    WebDriverWait wait;
    tc9Page page;

    public tc9Steps() {
        this.driver = Hooks.driver;
        wait = new WebDriverWait(driver, 10);
        this.page = new tc9Page(driver);
    }

    @Given("^el usuario ha iniciado sesión y está en la página de perfil$")
    public void usuario_ha_iniciado_sesion_y_esta_en_pagina_de_perfil() {
        page.navegarAPaginaDePerfil();
    }

    @When("^el usuario edita su información de perfil$")
    public void usuario_edita_su_informacion_de_perfil() {
        page.editarInformacionDePerfil("Nuevo Nombre", "nuevoemail@example.com");
    }

    @And("^guarda los cambios$")
    public void guarda_los_cambios() {
        page.guardarCambios();
    }

    @Then("^la información del usuario se actualiza correctamente$")
    public void la_informacion_del_usuario_se_actualiza_correctamente() {
        page.verificarActualizacionDeInformacion("Nuevo Nombre", "nuevoemail@example.com");
    }
}