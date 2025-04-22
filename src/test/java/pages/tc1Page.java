package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1Page {

    WebDriver driver = new ChromeDriver();
    private By loginForm = By.id("login-form");

    public void navigateToLoginPage() {
        driver.get("https://www.example.com/login");
    }

    public boolean isLoginFormVisible() {
        WebElement loginFormElement = driver.findElement(loginForm);
        return loginFormElement.isDisplayed();
    }

    public void closeDriver() {
        driver.quit();
    }
}