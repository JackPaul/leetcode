package easy;

public class P383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length())
        	return false;
        else {
        	char[] charArray = ransomNote.toCharArray();
        	char[] charArray2 = magazine.toCharArray();
        	
        	char[] r = new char[26];
        	char[] m = new char[26];
        	
        	for(char c : charArray) {
        		r[c - 'a']++;
        	}
        	
        	for(char c : charArray2) {
        		m[c - 'a']++;
        	}
        	
        	for(int i = 0; i < 26; i++) {
        		if(m[i] < r[i])
        			return false;
        	}
        	return true;
        }
    }

}
