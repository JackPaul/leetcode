package easy;


class MyHashSet {
	int[] records = null;
    /** Initialize your data structure here. */
    public MyHashSet() {
        records = new int[1000001];
    }
    
    public void add(int key) {
    	if(records[key] < 1000)
    		records[key] = 1;
    }
    
    public void remove(int key) {
    	if(records[key] > 0)
    		records[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return records[key] > 0;
    }
}

public class P705 {

}
