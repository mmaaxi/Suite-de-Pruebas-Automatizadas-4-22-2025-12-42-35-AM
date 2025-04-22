package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc3Page {

    WebDriver driver;

    By searchBox = By.id("search_input");
    By productList = By.id("product_list");

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("http://www.example.com");
    }

    public void enterSearchQuery(String query) {
        WebElement searchInputElement = driver.findElement(searchBox);
        searchInputElement.clear();
        searchInputElement.sendKeys(query);
        searchInputElement.submit();
    }

    public boolean isProductListDisplayed() {
        return driver.findElements(productList).size() > 0;
    }
}