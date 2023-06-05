package utility.config;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

import static utility.config.ConfigFileLoader.configReader;
import static utility.config.ConfigHelper.fetchData;

@Slf4j
public class GUIConfig {
    private static final ConfigRecord<String> browser = new ConfigRecord<>("gui.browser");
    private static final ConfigRecord<String> baseURL = new ConfigRecord<>("gui.base-url");
    private static final ConfigRecord<Boolean> opHeadless = new ConfigRecord<>("gui.options.headless");
    private static final ConfigRecord<String> opScreenSizeAtHeadless =
            new ConfigRecord<>("gui.options.screen-size-at-headless");
    private static final ConfigRecord<String> opPageLoadingStrategy =
            new ConfigRecord<>("gui.options.page-Loading-strategy");
    private static final ConfigRecord<List<String>> opArguments =
            new ConfigRecord<>("gui.options.arguments");

    private GUIConfig() {
    }

    public static Optional<String> browser() {
        return fetchData(browser, key -> configReader().get(key).asString());
    }

    public static Optional<String> baseURL() {
        return fetchData(baseURL, key -> configReader().get(key).asString());
    }

    public static Optional<Boolean> headless() {
        return fetchData(opHeadless, key -> configReader().get(key).asBoolean());
    }

    public static Optional<String> headlessScreenSize() {
        return fetchData(opScreenSizeAtHeadless, key -> configReader().get(key).asString());
    }

    public static Optional<String> pageLoadingStrategy() {
        return fetchData(opPageLoadingStrategy, key -> configReader().get(key).asString());
    }

    public static Optional<List<String>> arguments() {
        return fetchData(opArguments, key -> configReader().get(key).asList(String.class));
    }
}
