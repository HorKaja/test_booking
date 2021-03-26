import com.codeborne.selenide.SelenideElement;

public class SignedUserHeaderSection extends HeaderSection{

    private SelenideElement accountLabel = $x("//span[@class='bui-avatar-block__title']");
    private SelenideElement viewNotifications = $x("//button[@data-text='View your notifications']");



}
