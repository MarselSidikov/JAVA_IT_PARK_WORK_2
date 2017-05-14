package ru.rianov;

public interface Cache<K,V> {
    void cache(K key, V object);
    V get(K key);
    void clear();
}
