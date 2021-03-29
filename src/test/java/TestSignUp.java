import org.testng.annotations.*;


import static org.assertj.core.api.Assertions.assertThat;


public class TestSignUp {

    @Test(priority = 3, description = "verify user registration with correct credentials")
    public void verifyUserRegistrationCorrectCreds() {
        var signUpPage = startRegisterPage()
                .inputEmail("testdata1234@test.com")
                .inputPassword("2forget!");
        assertThat(signUpPage.isUserSignedIn())
                .as("The user is not authorized in the app")
                .isTrue();
    }

    @Test(priority = 2, description = "verify register button leads to registration form")
    public void verifyRegisterButtonLeadsRegisterForm() {
        var registeredPage = startRegisterPage();
        var messageText = registeredPage
                .getSignInOrCreateAccountLabel();

        assertThat(messageText)
                .as("Incorrect message text")
                .isEqualTo(registeredPage.getSignInMessage());

        assertThat(registeredPage.isEmailFieldDisplayed())
                .as("Email input field should be displayed")
                .isTrue();
    }

    @Test(priority = 1, description = "verify the user can find a hotel in specified city")
    public void verifyTheUserCanFindHotel() {
        StaySearchResultPage location = new BookingHomePage()
                .openBookingHomePage()
                .getStaySearchSection()
                .chooseStaysOptions("Khmelnytskyi", "2021-04-01", "2021-04-02");
        assertThat(location.getResultsTitle().isDisplayed())
                .as("The hotels in specified city are not found")
                .isTrue();
    }

    private RegisterPage startRegisterPage() {
        return new BookingHomePage()
                .openBookingHomePage()
                .getHeaderSection()
                .openRegisterPage();
    }

}
