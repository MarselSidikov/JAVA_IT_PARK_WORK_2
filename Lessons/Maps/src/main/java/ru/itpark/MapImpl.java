package ru.itpark;

/**
 * Created by Student21 on 07.07.2017.
 */
public class MapImpl<K, V> implements Map<K, V> {
    private int MAP_ARRAY_SIZE = 10;

    private class MapEntry {
        K key;

        V value;
        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    private LinkedList<MapEntry> entries[];

    public MapImpl() {
        entries = new LinkedList[MAP_ARRAY_SIZE];
    }

    // key -> int-число
    public void put(K key, V value) {
        int position = key.hashCode() % MAP_ARRAY_SIZE;
        MapEntry newEntry = new MapEntry(key, value);
        if (entries[position] != null) {
            entries[position].addToBegin(newEntry);
        } else {
            entries[position] = new LinkedList<>();
            entries[position].addToBegin(newEntry);
        }
    }

    public V get(K key) {
        return null;
    }
}
