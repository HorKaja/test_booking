import com.codeborne.selenide.SelenideElement;
import lombok.Getter;


import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class RegisterPage extends BookingHomePage {

    private SelenideElement signInOrCreateAccountLabel = $x("//h1[contains(text(), 'Sign in or create an account')]");
    @Getter
    private SelenideElement emailInputField = $x("//input[@id='username']");
    @Getter
    private SelenideElement submitButton = $x("button[type='submit']");
    private final String signInMessage = "Sign in or create an account";
    @Getter
    private final String createPasswordMessage = "Create password";
    @Getter
    private SelenideElement passwordInputField = $x("//input[@id='new_password']");
    @Getter
    private SelenideElement passwordConfirmField = $x("//input[@id='confirmed_password']");

    public String getSignInOrCreateAccountLabel() {
        return signInOrCreateAccountLabel.getText();
    }

    public boolean isEmailFieldDisplayed() {
        return getEmailInputField().isDisplayed();
    }

    public boolean isPasswordInputDisplayed() {
        return getEmailInputField().isDisplayed();
    }

    
    public void clickSubmit() {
        this.submitButton.click();
    }
}
