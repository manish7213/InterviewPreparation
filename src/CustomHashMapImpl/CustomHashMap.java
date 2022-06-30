package CustomHashMapImpl;

import java.util.Objects;

public class CustomHashMap<K, V> {
    private int capacity = 16;

    private CustomEntry<K, V>[] buckets;

    public CustomHashMap() {
        buckets = new CustomEntry[capacity];
    }

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new CustomEntry[capacity];
    }

    public void put(K key, V value) {
        int index = index(key);
        CustomEntry<K, V> newEntry = new CustomEntry<>(key, value, null);
        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            CustomEntry<K, V> previousNode = null;
            CustomEntry<K, V> currentNode = buckets[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null) previousNode.setNext(newEntry);
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        CustomEntry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        CustomEntry<K, V> previous = null;
        CustomEntry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                if (previous == null) {
                    entry = entry.getNext();
                    buckets[index] = entry;
                } else {
                    previous.setNext(entry.getNext());
                }
                return;
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    private int index(K key) {
        return Math.abs(Objects.hashCode(key) & (capacity - 1) );
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                CustomEntry<K, V> currentNode = buckets[i];
                while (currentNode != null) {
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

}

