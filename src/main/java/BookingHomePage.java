import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class BookingHomePage {

     private String URL = "https://www.booking.com/";

     public BookingHomePage openBookingHomePage() {
          open(URL);

          return this;
     }

     public HeaderSection getHeaderSection() {
          return new HeaderSection();
     }

     public StaysSearchSection getStaySearchSection() {
          return new StaysSearchSection();
     }


}
