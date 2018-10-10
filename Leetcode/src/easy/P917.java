package easy;

public class P917 {
    public String reverseOnlyLetters(String S) {
        char[] charArray = S.toCharArray();
        int i = 0; 
        int j = S.length() - 1;
        while(i < j) {
        	if(isAlpha(charArray[i]) && isAlpha(charArray[j])) {
        		char c = charArray[i];
        		charArray[i] = charArray[j];
        		charArray[j] = c;
        		i++;
        		j--;
        	}
        	
        	if(!isAlpha(charArray[i]))
        		i++;
        	if(!isAlpha(charArray[j]))
        		j--;
        }  
        return new String(charArray);
    }

	private boolean isAlpha(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		return false;
	}
}
