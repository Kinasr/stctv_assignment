package utility.config;

import exception.YAMLFileException;
import lombok.extern.slf4j.Slf4j;
import nsr_yaml.YAML;
import nsr_yaml.YAMLReader;

@Slf4j
public class ConfigFileLoader {
    private static YAMLReader configFile;
    private final YAMLReader reader;

    private ConfigFileLoader() {
        YAMLReader r;
        try {
            r = YAML.read("src/main/resources/config.yaml");
        } catch (YAMLFileException e) {
            log.error("Failed to access 'config.yaml' file or file not found in src/main/resources directory");
            throw new YAMLFileException("Please provide the config.yaml file under src/main/resources/", e);
        }

        reader = r;
    }

    public static YAMLReader configReader() {
        if (configFile == null) {
            configFile = new ConfigFileLoader().reader;
        }

        return configFile;
    }
}
