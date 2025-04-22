package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc2Page {
    private WebDriver driver;

    private By userNameField = By.id("username");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By submitButton = By.id("submit");
    private By confirmationMessage = By.id("confirmation");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}