package leetcode;

public class P409 {

    public static int longestPalindrome(String s) {
        int res = 0;
        
        int[] charMapLower= new int[26];
        int[] charMapUpper= new int[26];
        for(char c : s.toCharArray()) {
        	if(c <= 'Z')
        		charMapUpper[c-'A']++;
        	else
        		charMapLower[c-'a']++;
        }
        
        int maxOdd = 1;
        int flag = 0;
        //寻找最大奇数  累加偶数
        for(int i : charMapLower) {
        	if(i > 0) {
            	if(i % 2 == 0) {
            		res += i;
            	} else {
            		//maxOdd = maxOdd >= i?maxOdd:i;
            		res += i - 1;
            		flag = 1;
            	}
        	}
        }
        
        //寻找最大奇数  累加偶数
        for(int i : charMapUpper) {
        	if(i > 0) {
            	if(i % 2 == 0) {
            		res += i;
            	} else {
            		//maxOdd = maxOdd >= i?maxOdd:i;
            		res += i - 1;
            		flag = 1;
            	}
        	}
        }
        return res+flag;
    }
    
    public static void main(String[] args) {
		System.out.println(longestPalindrome("aaa"));
	}

}
