package ru.itpark;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    public void add(T element) {
        // создали новый узел связного списка
        Node<T> newNode = new Node<T>(element);
        if (count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            // положили новый узел после последнего
            this.tail.next = newNode;
            // сделаем новый узел последним
            this.tail = newNode;
        }
        count++;
    }

    public void addToBegin(T element) {
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        this.head = newNode;
        count++;
    }

    /**
     * Получение индекса элемента в списке через equals
     * @param element искомый элемент
     * @return порядковый номер в списке, если элемента
     * в списке нет - вернуть -1
     */
    public int indexOf(T element) {
        return -1;
    }

    public void remove(T element) {

    }

    public void removeAt(int index) {

    }

    public T get(int index) {
        if (index < count) {
            if (index == count -1) {
                return tail.element;
            } else if (index == 0) {
                return head.element;
            } else {
                Node<T> current = this.head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }

                return current.element;
            }
        } else {
            throw new IllegalArgumentException("Неверный индекс");
        }
    }
}
