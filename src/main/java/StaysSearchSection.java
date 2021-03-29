import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StaysSearchSection extends BookingHomePage {


    private SelenideElement searchFieldForDestination = $x("//input[@id='ss']");
    private SelenideElement searchButton = $x("//button[@data-sb-id='main']");
//    private SelenideElement checkinYear = $x("//input[@name='checkin_year']");
    private SelenideElement pickDate = $x("//div[@class='xp__input-group xp__date-time']");

    private String datetoInput;
    private SelenideElement checkDate = $x(String.format("//td[@data-date=%s]", datetoInput));

    public StaySearchResultPage chooseStaysOptions(String city, String checkInDate, String checkOutDate) {
        StaysSearchSection location = new StaysSearchSection();

        location
                .searchFieldForDestination
                .setValue(city);

//        location
//                .pickDate
//                .click();
//        datetoInput = checkInDate;
//        location
//                .checkDate
//                .click();
        location
                .searchButton
                .click();

        return new StaySearchResultPage();
    }


}




