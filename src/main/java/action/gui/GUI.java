package action.gui;

import action.gui.utility.GUIDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import utility.exception.ConfigurationException;

import java.time.Duration;

import static action.gui.utility.GUIDriverManager.driver;
import static utility.config.GUIConfig.baseURL;

@Slf4j
public class GUI {
    private GUI() {
    }

    public static void open() {
        open(baseURL().orElseThrow(() -> {
            throw new ConfigurationException("Please provide a base URL at the configuration file " +
                    "or use the open(String) method");
        }));
    }

    public static void open(String url) {
        driver().get(url);
    }

    public static GUIElementAction element(By by) {
        return new GUIElementAction(driver(), by);
    }
}
