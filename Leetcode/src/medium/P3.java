package medium;

public class P3 {
    public int lengthOfLongestSubstring(String s) {
        //int [] nums = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        int res = 0;
        int[] charsMap = new int[26];
        int i = 0;
        int low = 0;
        
        char[] chars = s.toCharArray();
        while(i < s.length()) {
        	if(charsMap[chars[i] - 'a'] > 0) {
        		low = chars
        	} else {
        		charsMap[s.charAt(i) - 'a']++;
        	}
        }
        return res;
    }
}
