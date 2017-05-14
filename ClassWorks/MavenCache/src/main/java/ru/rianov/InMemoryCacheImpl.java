package ru.rianov;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCacheImpl<K,V> extends CacheStrategy<K> implements Cache<K,V> {

    private Map<K, V> cache;
    private final int MAX_CACHE_SIZE = 5;
    private int count = 0;

    public InMemoryCacheImpl() {
        this.cache = new HashMap<K, V>();
    }

    public void cache(K key, V object) {
        if (count < MAX_CACHE_SIZE) {
            cache.put(key, object);
            count++;
        } else {
            // найти объект с минимальным количеством использования
            // удалить
        }
    }

    public V get(K key) {
        call(key);
        return cache.get(key);
    }

    public void clear() {

    }

    public void removeFromCache(K key) {

    }
}
