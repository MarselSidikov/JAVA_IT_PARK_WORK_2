package ru.rianov;

import java.util.HashMap;
import java.util.Map;

public abstract class CacheStrategy<K> {
    private Map<K, Integer> callNumbers;

    protected void call(K key) {
        int callNumbersForKey = callNumbers.get(key);
        callNumbers.put(key, callNumbersForKey + 1 );
    }

    public abstract void removeFromCache(K key);
}
