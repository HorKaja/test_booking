import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class HeaderSection extends BookingHomePage {
    //Header links
    private SelenideElement currencyButton = $x("//button[@data-tooltip-text='Choose your currency']");
    private SelenideElement languageButton = $x("//button[@data-modal-id='language-selection']");
    private SelenideElement customerServiceButton = $x("//a[@data-tooltip-text='Contact Customer Service']");
    private SelenideElement partnerButton = $x("//a[@class='bui-button bui-button--light bui-traveller-header__product-action']");
    private SelenideElement registerButton = $x("//*[contains(text(), 'Register')]//ancestor::a");
    private SelenideElement signInButton = $x("//*[contains(text(), 'Sign in')]//ancestor::a[@class='bui-button bui-button--secondary js-header-login-link']");

    //Navigation links
    protected final String STAYS = "//a[@data-ga-track='click|Product Expansion|accommodation|booking (index)']";
    protected final String FLIGHTS = "//a[@data-ga-track='click|Product Expansion|flights|kayak (index)']";
    protected final String CAR_RENTAL = "//a[@data-ga-track='click|Product Expansion|cars|rentalcars (index)']";
    protected final String ATTRACTIONS = "//a[@data-decider-header='attractions']";
    protected final String AIRPORT_TAXIS = "//a[@data-decider-header='rideways']";


    public RegisterPage openRegisterPage() {
        registerButton.click();

        return new RegisterPage();
    }
}
