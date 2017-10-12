package page_objects;

import org.openqa.selenium.By;

public class LitecartMainPage extends AbstractPage {

    private final By emailAdressFieldLocator = By.name("email");
    private final By passwordFieldLocator = By.name("password");
    private final By loginButtonLocator = By.name("login");

    public boolean isEmailAddressFieldPresent() {
        return isElementPresent(emailAdressFieldLocator);
    }

    public boolean isPasswordFieldPresent() {
        return isElementPresent(passwordFieldLocator);
    }

    public Boolean isLoginButtonPresent() {
        return isElementPresent(loginButtonLocator);
    }

    private Boolean isElementPresent(By element) {
        return !driver.findElements(element).isEmpty();
    }

    public LitecartMainPage open() {
        driver.get("http://localhost/litecart");

        return new LitecartMainPage();
    }
}
