package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc2Page;

public class tc2Steps {
    private WebDriver driver;
    private tc2Page registrationPage;

    @Given("El usuario está en la página de registro")
    public void el_usuario_esta_en_la_pagina_de_registro() {
        driver = new ChromeDriver();
        registrationPage = new tc2Page(driver);
        driver.get("http://www.ejemplo.com/registro");
    }

    @When("El usuario ingresa los datos en el formulario de registro")
    public void el_usuario_ingresa_los_datos_en_el_formulario_de_registro() {
        registrationPage.enterUserName("ejemplo_usuario");
        registrationPage.enterEmail("ejemplo@correo.com");
        registrationPage.enterPassword("segura123");
        registrationPage.submitForm();
    }

    @Then("Se crea un nuevo usuario")
    public void se_crea_un_nuevo_usuario() {
        String confirmationMessage = registrationPage.getConfirmationMessage();
        Assert.assertEquals("Usuario creado exitosamente", confirmationMessage);
        driver.quit();
    }
}