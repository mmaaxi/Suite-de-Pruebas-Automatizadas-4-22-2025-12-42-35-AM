package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc5Page {
    private WebDriver driver;
    private WebDriverWait wait;
    
    private By paymentName = By.id("payment-name");
    private By paymentCardNumber = By.id("payment-card-number");
    private By paymentExpiryDate = By.id("payment-expiry-date");
    private By paymentCVC = By.id("payment-cvc");
    private By confirmButton = By.id("confirm-purchase");
    private By successMessage = By.id("success-message");

    public tc5Page() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToPaymentPage() {
        driver.get("https://example.com/checkout");
    }

    public void enterPaymentDetails(String name, String cardNumber, String expiryDate, String cvc) {
        driver.findElement(paymentName).sendKeys(name);
        driver.findElement(paymentCardNumber).sendKeys(cardNumber);
        driver.findElement(paymentExpiryDate).sendKeys(expiryDate);
        driver.findElement(paymentCVC).sendKeys(cvc);
    }

    public void confirmPurchase() {
        driver.findElement(confirmButton).click();
    }

    public boolean isPurchaseSuccessful() {
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return message.isDisplayed() && message.getText().equals("Purchase Successful");
    }
}