package leetcode;

public class P520 {

    public static boolean detectCapitalUse(String word) {
    	if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
    		return word.equals(word.toLowerCase());
    	}else {
    		return (word.substring(1, word.length()).
    				equals(word.substring(1, word.length()).toLowerCase()) || 
    				word.substring(1, word.length()).equals
    				(word.substring(1, word.length()).toUpperCase()));
    	}
    	
    }

    public static void main(String[] args) {
		System.out.println(detectCapitalUse("AAAa"));
	}
}
