package leetcode;

public class P151 {
    public String reverseWords(String s) {
        String res = "";
        s = s.trim();
        String[] words = s.split(" +");
        for(int i = words.length - 1; i >= 0; i--) {
        	res = res+ words[i] + " ";
        }
        return res.trim();
    }
}
