package easy;

public class P859 {

    public static boolean buddyStrings(String A, String B) {
        if(A.length() != B.length() || A.length() < 2 || B.length() < 2)
        	return false;
        else {
        	if(A.equals(B)) {
        		char[] a = new char[26];
        		for(char ch : A.toCharArray()) {
        			a[ch-'a']++;
        		}
        			
        		for(int i : a) {
        			if(i >= 2)
        				return true;
        		}
        		return false;
        	}
        		
        	int count = 0;
        	int index[] = new int[2];
        	for(int i = 0; i <= A.length() - 1; i++) {
        		if(A.charAt(i) != B.charAt(i)) {
        			if(count < 2)
        				index[count++] = i;
        			else
        				count++;

        		}
        	}
        	
        	if(count == 2) {
        		if(A.charAt(index[0]) == B.charAt(index[1]) && A.charAt(index[1]) == B.charAt(index[0]))
        			return true;
        		else
        			return false;
        	} else {
        		return false;
        	}
        	
        }
    }

    public static void main(String[] args) {
		System.out.println(buddyStrings("aabc", "aabd"));
	}
}
