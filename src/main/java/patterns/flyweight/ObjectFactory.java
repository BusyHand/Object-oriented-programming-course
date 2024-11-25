package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private final Map<String, ObjectExample> cache = new HashMap<>();

    public ObjectExample createObjectExample(String key) {
        return cache.computeIfAbsent(key, ObjectExample::new);
    }
}
