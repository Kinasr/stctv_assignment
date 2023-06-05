package action.gui;

import lombok.extern.slf4j.Slf4j;
import utility.exception.ConfigurationException;

import static action.gui.utility.GUIDriverManager.driver;
import static utility.config.GUIConfig.baseURL;

@Slf4j
public class GUI {

    private GUI() {
    }

    public static GUI open() {
        var url = baseURL().orElseThrow(() -> {
            throw new ConfigurationException("Please provide a base URL at the configuration file " +
                    "or use the open(String) method");
        });

        return open(url);
    }

    public static GUI open(String url) {
        driver().get(url);

        return new GUI();
    }
}
