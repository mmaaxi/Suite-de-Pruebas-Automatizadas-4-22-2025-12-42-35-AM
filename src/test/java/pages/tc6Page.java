package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class tc6Page {

    WebDriver driver;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "profile-link")
    private WebElement profileLink;

    @FindBy(how = How.CLASS_NAME, using = "profile-info")
    private WebElement profileInfo;

    public void goToUserProfile() {
        profileLink.click();
    }

    public boolean isProfileInfoDisplayed() {
        return profileInfo.isDisplayed();
    }
}