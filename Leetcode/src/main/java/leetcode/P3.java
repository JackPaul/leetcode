package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */

public class P3 {

    /*
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals(""))
        	return 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 1;
        int low = 0;
        int high = 1;
        int p = 0;
        map.put(s.charAt(0), 0);
        while(high < s.length()) {
        	char c = s.charAt(high);

        	if(map.containsKey(c)) {
        		res = (high - low)>res?(high-low):res;
        		p = map.get(c);
        		for(int i = low; i <= p; i++) {
        			map.remove(s.charAt(i));
        		}
        		low = p + 1;
        	}

        	map.put(c, high);
        	high++;

        }
        res = (high - low)>res?(high-low):res;
        return res;
    }
    */


    //遇到相同的字符时其实不必修改其最先出现位置的其他字符位置，只需比较相同字符最先出现的位置在不在起点后面
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int[] charPos = new int[256];
        Arrays.fill(charPos, -1);
        int res = 1;
        int start = 0;
        int i = 0;
        int len = 0;
        while(i < s.length()) {

            if(charPos[s.charAt(i) - 0] == -1) {
                charPos[s.charAt(i) - 0] = i;
            } else {
                if(charPos[s.charAt(i) - 0] >= start) {
                    len = i - start;
                    res = res>=len?res:len;
                    start = charPos[s.charAt(i) - 0] + 1;
                }
                charPos[s.charAt(i) - 0] = i;
            }
            i++;
        }
        len = i - start;
        res = res>=len?res:len;
        return res;
    }
    public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(" "));
	}
}
