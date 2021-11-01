import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;


public class RegisterPage  {

    private SelenideElement signInOrCreateAccountLabel = $x("//h1[contains(text(), 'Sign in or create an account')]");
    private SelenideElement createPasswordLabel = $x("//h1[contains(text(), 'Create password')]");
    private SelenideElement emailInputField = $x("//input[@id='username']");
    private SelenideElement submitButton = $("button[type='submit']");
    private SelenideElement passwordInputField = $x("//input[@id='new_password']");
    private SelenideElement passwordConfirmField = $x("//input[@id='confirmed_password']");
    private SelenideElement securityCheckButton = $x("//div[@aria-label='Press and hold this button to pass the security check']");

    @Getter
    private final String signInMessage = "Sign in or create an account";
    @Getter
    private final String createPasswordMessage = "Create password";


    public String getSignInOrCreateAccountLabel() {
        return signInOrCreateAccountLabel.getText();
    }

    public boolean isEmailFieldDisplayed() {
        return emailInputField.isDisplayed();
    }

    public boolean isPasswordInputDisplayed() {
        return passwordInputField.isDisplayed();
    }

    public RegisterPage inputEmail(String email) {
        emailInputField.sendKeys(email);
        submitButton.click();
        return this;
    }

    public SignedUserHeaderSection inputPassword(String password) {
        passwordInputField.sendKeys(password);
        passwordConfirmField.sendKeys(password);
        submitButton.click();

        actions()
                .moveToElement(securityCheckButton)
                .clickAndHold();

        return new SignedUserHeaderSection();
    }
}
