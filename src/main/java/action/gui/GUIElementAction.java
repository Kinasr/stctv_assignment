package action.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static action.gui.utility.GUIWait.waitForElementToBeClickable;
import static action.gui.utility.GUIWait.waitForElementToBeVisible;

public class GUIElementAction {
    private final WebDriver driver;
    private final By by;

    protected GUIElementAction(WebDriver driver, By by) {
        this.driver = driver;
        this.by = by;
    }

    public GUIElementAction click() {
        waitForElementToBeClickable(by)
                .click();
        return this;
    }

    public GUIElementAction type(String text) {
        waitForElementToBeVisible(by)
                .sendKeys(text);
        return this;
    }
}
