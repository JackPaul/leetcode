package easy;

import java.util.ArrayList;
import java.util.List;

public class P784 {

//    public List<String> letterCasePermutation(String S) {
//        List<String> res = new ArrayList<>();
////        if(S.equals(""))
////        	return res;
//        res.add(S);
//        
//        List<String> currentList = new ArrayList<>();
//        for(int i = 0; i < S.length(); i++) {
//        	currentList.clear();
//        	for(String str : res) {
//                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                	//res.add((S.charAt(0)+"").toUpperCase()+S.substring(1));
//                	currentList.add(str.substring(0, i) + (str.charAt(i)+"").toUpperCase()+str.substring(i+1));
//                } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                	currentList.add(str.substring(0, i) + (str.charAt(i)+"").toLowerCase()+str.substring(i+1));
//                }
//        	}
//        	res.addAll(currentList);
//        }
//        return res;
//    }
	
	public static List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        dfs(res, S.toCharArray(), 0);
        return res;
    }
    
    private static void dfs(List<String> res, char[] chars, int idx) {
    	System.out.println(res);
        if (idx == chars.length) {
            res.add(new String(chars));
            return;
        }
        
        if (chars[idx] > '9') {
            chars[idx] = chars[idx] > 'Z' ? (char)(chars[idx] - 32) : (char)(chars[idx] + 32);
            dfs(res, chars, idx + 1);
            chars[idx] = chars[idx] > 'Z' ? (char)(chars[idx] - 32) : (char)(chars[idx] + 32);
        }

        dfs(res, chars, idx + 1);
    }
    
    public static void main(String[] args) {
    	letterCasePermutation("Abcde");
	}

}
