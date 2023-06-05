package utility.config;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
public final class ConfigRecord<T> {
    private final String key;
    private T value;
    private Boolean isExist = false;
    private Boolean isFetched = false;

    public ConfigRecord(String key) {
        this.key = key;
    }
}
