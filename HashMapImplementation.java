import java.util.*;

public interface HashMapImplementation {

    static class MyHashMap<K, V> {

        static final int DEFAULT_CAPACITY = 4;
        static final float DEFAULT_LOAD_FACTOR = 0.75f;

        class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private LinkedList<Node>[] buckets;

        // Constructor
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
            n = 0;
        }

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunc(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

        private int searchBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashFunc(key);
            LinkedList<Node> ll = buckets[bi];

            int di = searchBucket(ll, key);
            if (di == -1) {
                ll.add(new Node(key, value));
                n++;
            } else {
                ll.get(di).value = value;
            }
        }

        public V get(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> ll = buckets[bi];

            int di = searchBucket(ll, key);
            if (di == -1) return null;

            return ll.get(di).value;
        }

        public V remove(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> ll = buckets[bi];

            int di = searchBucket(ll, key);
            if (di == -1) return null;

            V val = ll.get(di).value;
            ll.remove(di);
            n--;
            return val;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("A", 1);
        mp.put("B", 2);
        System.out.println(mp.get("A")); // 1
        mp.remove("A");
        System.out.println(mp.get("A")); // null
    }
}
