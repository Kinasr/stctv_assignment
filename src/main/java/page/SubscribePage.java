package page;

import action.gui.GUI;
import org.openqa.selenium.By;

public class SubscribePage {

    // region Locator
    private final By buttonSelectCountry = By.cssSelector("#header .country-current");
    private final By textCurrencyLite = By.id("currency-lite");
    private final By textCurrencyClassic = By.id("currency-classic");
    private final By textCurrencyPremium = By.id("currency-premium");
    // endregion

    public static SubscribePage navigate() {
        GUI.open();
        return new SubscribePage();
    }

    public SelectCountryPopup openSelectCompany() {
        GUI.element(buttonSelectCountry)
                .click();
        return new SelectCountryPopup();
    }

    public void assertThatLitePriceAndCurrencyIs(String priceAndCurrency) {
        GUI.element(textCurrencyLite)
                .text()
                .assertThat()
                .isEqualTo(priceAndCurrency)
                .perform();
    }

    public void assertThatClassicPriceAndCurrencyIs(String priceAndCurrency) {
        GUI.element(textCurrencyClassic)
                .text()
                .assertThat()
                .isEqualTo(priceAndCurrency)
                .perform();
    }

    public void assertThatLitePremiumPriceAndCurrencyIs(String priceAndCurrency) {
        GUI.element(textCurrencyPremium)
                .text()
                .assertThat()
                .isEqualTo(priceAndCurrency)
                .perform();
    }
}
