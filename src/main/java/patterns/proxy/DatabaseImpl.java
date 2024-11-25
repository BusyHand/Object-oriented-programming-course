package patterns.proxy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DatabaseImpl implements Database {

    private final Map<Integer, String> db = new ConcurrentHashMap<>();

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public String save(String value) {
        db.put(atomicInteger.getAndIncrement(), value);
        return value;
    }

    @Override
    public String update(Integer id, String value) {
        if (!db.containsKey(id)) {
            throw new IllegalArgumentException("Значения с id: " + id + " - не существует");
        }
        db.put(id, value);
        return value;
    }

    @Override
    public String delete(Integer id, String value) {
        if (!db.containsKey(id)) {
            throw new IllegalArgumentException("Значения с id: " + id + " - не существует");
        }
        return db.remove(id);
    }

    @Override
    public String readById(Integer id) {
        return db.getOrDefault(id, "Not found");
    }
}
