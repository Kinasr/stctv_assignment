package test_package;

import action.gui.GUI;
import data_provider.SubscriptionDataProvider;
import model.CountrySubscription;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.SubscribePage;

public class SubscriptionTest {

    @AfterMethod
    void teardown() {
        GUI.quit();
    }

    @Test(dataProviderClass = SubscriptionDataProvider.class, dataProvider = "liteSubscription", description = "Check Lite Package Price And Currency")
    void checkLitePackagePriceAndCurrency(CountrySubscription subscription) {
        SubscribePage.navigate()
                .openSelectCompany()
                .selectCountry(subscription.country())
                .assertThatLitePriceAndCurrencyIs(subscription.priceAndCurrency());
    }

    @Test(dataProviderClass = SubscriptionDataProvider.class, dataProvider = "classicSubscription")
    void checkClassicPackagePriceAndCurrency(CountrySubscription subscription) {
        SubscribePage.navigate()
                .openSelectCompany()
                .selectCountry(subscription.country())
                .assertThatClassicPriceAndCurrencyIs(subscription.priceAndCurrency());
    }

    @Test(dataProviderClass = SubscriptionDataProvider.class, dataProvider = "premiumSubscription")
    void checkPremiumPackagePriceAndCurrency(CountrySubscription subscription) {
        SubscribePage.navigate()
                .openSelectCompany()
                .selectCountry(subscription.country())
                .assertThatLitePremiumPriceAndCurrencyIs(subscription.priceAndCurrency());
    }
}
