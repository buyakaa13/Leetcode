class MyHashMap {
    int[] hashMap;
    
    public MyHashMap() {
        hashMap = new int[1000000+1];
    }
    
    public void put(int key, int value) {
        hashMap[key] = value+1;
    }
    
    public int get(int key) {
        return hashMap[key]-1;
    }
    
    public void remove(int key) {
        hashMap[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */