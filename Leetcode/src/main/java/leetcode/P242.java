package leetcode;

public class P242 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        	return false;
        
        boolean[] flags = new boolean[s.length()];
        char[] tableS = new char[26];
        char[] tableT = new char[26];
        for(int i = 0; i < s.length(); i++) {
        	tableS[s.charAt(i) - 'a']++;
        	tableT[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i <= 26; i++) {
        	if(tableS[i] > 0 && tableS[i] != tableT[i]) {
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
		System.out.println(isAnagram("anagram"
				,"nagaram"));
	}

}
