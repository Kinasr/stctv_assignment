package action.gui.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class GUIWait {

    private static final FluentWait<WebDriver> wait;

    static {
        wait = new FluentWait<>(GUIDriverManager.driver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500));
    }

    public static WebElement waitForElementPresence(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitForElementToBeClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(
                waitForElementPresence(by)
        ));
    }

    public static WebElement waitForElementToBeVisible(By by){
        return wait.until(ExpectedConditions.visibilityOf(
                waitForElementPresence(by)
        ));
    }
}
