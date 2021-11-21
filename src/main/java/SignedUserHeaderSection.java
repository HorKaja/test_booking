import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignedUserHeaderSection extends HeaderSection{

    private SelenideElement accountLabel = $x("//span[@class='bui-avatar-block__title']");
    private SelenideElement viewNotifications = $x("//button[@data-text='View your notifications']");

    public  boolean isUserSignedIn() {
        if (accountLabel.isDisplayed() && viewNotifications.isDisplayed()) {
            return true;
        } else {return false;}
    }
}

