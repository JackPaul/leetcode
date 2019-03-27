package easy;

class MyHashMap {

	int keys[][] = null;
	int values[][] = null;
    /** Initialize your data structure here. */
    public MyHashMap() {
        keys = new int[1001][];
        values = new int[1001][];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
    	int i = key / 1000, j = key % 1000;
        if(keys[i] == null ) {
        	keys[i] = new int[1000];
        	values[i] = new int[1000];	
        }
        keys[i][j] = 1;
        values[i][j] = value;  
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
    	int i = key / 1000, j = key % 1000;
    	if(keys[i] != null && keys[i][j] == 1) {
    		return values[i][j];
    	}
    	
    	return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
    	int i = key / 1000, j = key % 1000;
    	if(keys[i] != null && keys[i][j] == 1) {
    		keys[i][j] = 0;
    		values[i][j] = 0;
    	}
    }
}

public class P706 {
	
}
