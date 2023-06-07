package action.gui.utility;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static utility.config.GUIConfig.elementWait;
import static utility.config.GUIConfig.pollingEvery;

@Slf4j
public class GUIWait {

    private static final FluentWait<WebDriver> wait;

    static {
        wait = new FluentWait<>(GUIDriverManager.driver())
                .withTimeout(Duration.ofSeconds(elementWait().orElse(30L)))
                .pollingEvery(Duration.ofMillis(pollingEvery().orElse(500L)))
                .ignoring(NoSuchElementException.class);
    }

    private GUIWait() {
    }

    public static WebElement waitForElementPresence(By by) {
        log.debug("Waiting for <{}> to be presence", by);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitForElementToBeClickable(By by) {
        var e = waitForElementPresence(by);

        log.debug("Waiting for <{}> to be clickable", by);
        return wait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public static WebElement waitForElementToBeVisible(By by) {
        var e =  waitForElementPresence(by);

        log.debug("Waiting for <{}> to be visible", by);
        return wait.until(ExpectedConditions.visibilityOf(e));
    }
}
