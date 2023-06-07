package model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
public class CountrySubscription {
    private Country country;
    private String priceAndCurrency;
}
