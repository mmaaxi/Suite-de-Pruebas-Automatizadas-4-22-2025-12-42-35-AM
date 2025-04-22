package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertTrue;

public class tc8Page {

    private WebDriver driver;

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(linkText = "Recuperar contraseña")
    private WebElement recuperarContrasenaLink;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "sendEmailButton")
    private WebElement sendEmailButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public void clickRecuperarContrasenaLink() {
        recuperarContrasenaLink.click();
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
        sendEmailButton.click();
    }

    public void verifyEmailSent() {
        assertTrue("El mensaje de éxito no es visible", successMessage.isDisplayed());
    }
}