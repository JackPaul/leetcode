package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class P208 {

	class Trie {
	    /** Initialize your data structure here. */
		private Map<Character,Trie> elements;
		private Map<Character, Boolean> end;

	    public Trie() {
	    	elements = new HashMap<>();
	    	end = new HashMap<>();
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	    	if(word.length() == 0)
	    		return;
	    	if(word.length() == 1)
	    		end.put(word.charAt(0), true);
	    	if(!elements.containsKey(word.charAt(0))) {
	    		Trie ti = new Trie();
	    		System.out.println(ti);
	    		elements.put(word.charAt(0), ti);
	    	}
	    	elements.get(word.charAt(0)).insert(word.substring(1,  word.length()));
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	    	Trie cur = this;
	    	Trie pre = null;
	    	int i = 0;
	    	for(i = 0; i < word.length(); i++) {
	    		if(cur.elements.containsKey(word.charAt(i))) {
	    			pre = cur;
	    			cur = cur.elements.get(word.charAt(i));
	    		} else {
	    			return false;
	    		}
	    	}
	    	if(i == word.length() && !pre.end.containsKey(word.charAt(i-1)))
	    		return false;
	    	
	    	return true;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	    	Trie cur = this;
	    	int i = 0;
	    	Trie pre = null;
	    	for(i = 0; i < prefix.length(); i++) {
	    		if(cur != null && cur.elements.containsKey(prefix.charAt(i))) {
	    			pre = cur;
	    			cur = cur.elements.get(prefix.charAt(i));
	    		} else {
	    			break;
	    		}
	    	} 
	    	
	    	if(i == prefix.length())
	    		return true;
	    	else
	    		return false;
	    }
	    
	   
	}


}
