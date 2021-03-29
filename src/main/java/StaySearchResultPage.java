import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

public class StaySearchResultPage extends BookingHomePage {

    private SelenideElement allStaysFoundContainer = $x("//div[@id='hotellist_inner']");
    @Getter
    private SelenideElement resultsTitle = $x("//h1[contains (text(), 'Khmelnytskyi: ')]");

}
