package data_provider;

import model.CountrySubscription;
import nsr_yaml.YAML;
import nsr_yaml.YAMLReader;
import org.testng.annotations.DataProvider;

public class SubscriptionDataProvider {
    private static final YAMLReader packageSubscription = YAML
            .read("src/test/resources/subscriptions_currency_and_price.yaml");

    @DataProvider
    public static Object[][] liteSubscription() {
        return mapSubscription("lite");
    }

    @DataProvider
    public static Object[][] classicSubscription() {
        return mapSubscription("classic");
    }

    @DataProvider
    public static Object[][] premiumSubscription() {
        return mapSubscription("premium");
    }

    private static Object[][] mapSubscription(String subscriptionKey) {
        var subscriptions = packageSubscription.get(subscriptionKey).asList(CountrySubscription.class);

        var obj = new Object[subscriptions.size()][1];
        for (int i = 0; i < subscriptions.size(); i++) {
            obj[i][0] = subscriptions.get(i);
        }

        return obj;
    }
}
