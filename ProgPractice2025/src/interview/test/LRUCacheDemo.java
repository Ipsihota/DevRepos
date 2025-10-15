package interview.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo {

    int capacity;
    Map<Integer, String> map = new LinkedHashMap<>();
    Node_d head;
    Node_d tail;

    public LRUCacheDemo(int capacity) {
        this.capacity = capacity;
        head.key = 0;
        tail.key = 0;
    }
    public String get(int key)
    {
        if (map.containsKey(key)){

            return map.get(key);
        } else {
            return null;
        }
    }
    public void put(int key, String value) {

       map.put(key, value);
    }

    class Node_d{
        Node_d prev, next;
        int key;
        String val;
        public Node_d(int key, String val){
            this.key = key;
            this.val = val;
        }

        public void addNode(){

        }

        public void remove(){

        }
    }
}
