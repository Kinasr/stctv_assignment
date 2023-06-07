package page;

import action.gui.GUI;
import model.Country;
import org.openqa.selenium.By;

public class SelectCountryPopup {
    // region Locator
    private final By buttonBahrain = By.id("bh");
    private final By buttonKSA = By.id("sa");
    private final By buttonKuwait = By.id("kw");
    // endregion

    public SubscribePage selectCountry(Country country) {
        switch (country) {
            case BAHRAIN -> GUI.element(buttonBahrain).click();
            case KSA -> GUI.element(buttonKSA).click();
            case KUWAIT -> GUI.element(buttonKuwait).click();
        }

        return new SubscribePage();
    }
}
