package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P166 {
//    public static String fractionToDecimal(int numerator, int denominator) {
//       
//    	String res = "";
//        Map<Integer, Integer> visited = new HashMap<>();
//        int n = numerator;
//        String s = "";
//        while(denominator % 10 == 0) {
//        	System.out.println("...");
//        	denominator = denominator / 10;
//        	s = s + "0";
//        }
//        int k = 1;
//        String str = "";
//        String prefix = "";
//        int count = 0;
//        while(n != 0 && !visited.containsKey(n)) {
//        	visited.put(n, res.length());
//        	k = 1;
//        	str = "";
//            while(n < denominator) {
//            	n *= 10;
//            	k *= 10;
//            	if(count == 0)
//            		prefix += "0";
//            }
//
//            if(k > 10 && count > 0)
//            	if(s.length() >= 2)
//            		str = s.substring(2)+(k+"").substring(2)+(n / denominator);
//            	else
//            		str = (k+"").substring(2)+(n / denominator);
//            else
//            	if(s.length() >= 2)
//            		str += s.substring(2)+(n / denominator);
//            	else
//            		str += (n / denominator);
//            res += str;
//            
//            n = n % denominator;
//            count++;
//        }
//        System.out.println(res);
//        System.out.println(prefix);
//        System.out.println(s);
//        if(prefix.length() > 0) {
//        	prefix = "0."+prefix.substring(1);
//        }
//        if(n == 0)
//        	return prefix+s+res;
//        else
//        	return prefix+s+res.substring(0, visited.get(n))+"("+res.substring(visited.get(n))+")";
//   	
//
//    }
    public static String fractionToDecimal(int numerator, int denominator) {
    	return null;
    }
    public static void main(String[] args) {
		System.out.println(fractionToDecimal(40, 333));
	}
}
