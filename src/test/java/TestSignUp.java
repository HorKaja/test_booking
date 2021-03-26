import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;


public class TestSignUp {

    @Test(priority = 2, description = "verify user registration with correct credentials")
    public void verifyUserRegistrationCorrectCreds() {
        openRegisterPage()
                .getEmailInputField()
                .sendKeys("testdata123@test.com")
                .clickSubmit()
                .getPasswordInputField()
                .sendKeys();
    Assert.assertTrue(openRegisterPage().isPasswordInputDisplayed());
    }

    @Test(priority = 1, description = "verify register button leads to registration form")
    public void verifyRegisterButtonLeadsRegisterForm() {
        String messageText = openRegisterPage()
                .getSignInOrCreateAccountLabel();

        assertThat(messageText)
                .as("Registeration form is not displayed or no message is shown")
                .isEqualTo("Sign in or create an account");
        Assert.assertTrue(openRegisterPage().isEmailFieldDisplayed());
    }

    private RegisterPage openRegisterPage() {
        return new BookingHomePage()
                .openBookingHomePage()
                .getHeaderSection()
                .openRegisterPage();
    }


//    @Test(priority = 2, description = "verify correct email accepted")
//    public void verifyCorrectEmailAccepted() {
//        emailInputField.sendKeys("testdata123@test.com");
//        WebElement submitEmailButton = driver.findElement(By.cssSelector("button[type='submit']"));
//        submitEmailButton.click();
//        WebElement
//        Assert.assertTrue(emailInputField.isDisplayed());
//    }


//    @AfterClass
//    public void teardown() {
//        driver.quit();
//    }
}
