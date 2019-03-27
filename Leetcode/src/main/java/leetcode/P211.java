package leetcode;

import java.util.List;

public class P211 {

	static class WordDictionary {
		class Trie {
			char ch;
			Trie[] children = null;
			boolean isTerminal;
			public Trie(char c) {
				ch = c;
				children = new Trie[26];
			}
		}
		
		Trie root;
	    /** Initialize your data structure here. */
	    public WordDictionary() {
	        root = new Trie('\0');
	    }
	    
	    /** Adds a word into the data structure. */
	    public void addWord(String word) {
	    	Trie cur = root;
	        for(int i = 0; i < word.length(); i++) {
	        	char c = word.charAt(i);
	        	if(cur.children[c-'a'] == null)
	        		cur.children[c-'a'] = new Trie(c);
	        	cur = cur.children[c-'a'];
	        	if(i == word.length() - 1) {
	        		cur.isTerminal = true;
	        	}
	        }
	    }
	    
	    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	    public boolean search(String word) {
	    	Trie cur = root;
	    	return search(root, word);
	    }

		private boolean search(Trie root, String word) {
			if(root == null)
				return false;
			if(word.equals(""))
				return true;
			
			char c = word.charAt(0);
			if(word.length() == 1) {
				if(c == '.') {
					for(Trie t : root.children) {
	                    if(t != null && t.isTerminal)
						    return true;
					}
					return false;
				}
				 if(root.children[c-'a'] != null && root.children[c-'a'].isTerminal)
					 return true;
				 else
					 return false;
			}
			
			if(c == '.') {
				boolean r = false;
				for(Trie t : root.children) {
                    if(t != null)
					    r = r || search(t, word.substring(1));
				}
				return r;
			} else {
				if(root.children[c-'a'] == null)
					return false;
				return search(root.children[c-'a'], word.substring(1));
			}
			
		}
	}

	//["WordDictionary","addWord","addWord","search","search","search","search","search","search","search","search"]
	//[[],["a"],["ab"],["a"],["a."],["ab"],[".a"],[".b"],["ab."],["."],[".."]]
	public static void main(String[] args) {
		 WordDictionary obj = new WordDictionary();
		 obj.addWord("a");
		 obj.addWord("ab");
//		 obj.addWord("dad");
//		 obj.addWord("mad");
		 //["pad"],["bad"],[".ad"],["b.."]]
		 boolean f = obj.search("a");
		 System.out.println(f);
	}
}
