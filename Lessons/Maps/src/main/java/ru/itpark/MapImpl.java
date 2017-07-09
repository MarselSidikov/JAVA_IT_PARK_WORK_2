package ru.itpark;

public class MapImpl<K, V> implements Map<K, V> {
    private int MAP_ARRAY_SIZE = 10;

    private class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }
    }

    private class MapEntry {
        K key;
        V value;

        MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    // массив узлов
    private Node<MapEntry> entries[];

    public MapImpl() {
        entries = new Node[MAP_ARRAY_SIZE];
    }

    // key -> int-число
    public void put(K key, V value) {
        // получили позицию элемента
        int position = getPosition(key);
        // создали новое включение(ключ, значение)
        MapEntry newEntry = new MapEntry(key, value);
        // создаем новый узел
        Node<MapEntry> newNode =
                new Node<>(newEntry);
        // если в указанной позиции уже есть узлы
        if (entries[position] != null) {
            // ищем узел, который содержит включение с данным ключем
            Node<MapEntry> currentNode = entries[position];
            while (currentNode.next != null) {
                if (currentNode.element.key.equals(key)) {
                    currentNode.element.value = value;
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode.element.key.equals(key)) {
                currentNode.element.value = value;
                return;
            }
            // добавили в конец
            currentNode.next = newNode;
        } else {
            entries[position] = newNode;
        }
    }

    public V get(K key) {
        int position = getPosition(key);
        if (entries[position] == null) {
            return null;
        }
        Node<MapEntry> currentNode = entries[position];
        while (currentNode != null) {
            if (currentNode.element.key.equals(key)) {
                return currentNode.element.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    private int getPosition(K key) {
        return key.hashCode() % MAP_ARRAY_SIZE;
    }

    public void show() {
        for (int i = 0; i < entries.length; i++) {
            System.out.print("[" + i + "]");
            System.out.print("-->");
            Node<MapEntry> current = entries[i];
            while (current != null) {
                System.out.print
                        ("(" + current.element.key + "," + current.element.value + ")");
                current = current.next;
                System.out.print("-->");
            }
            System.out.println();
        }
    }
}
