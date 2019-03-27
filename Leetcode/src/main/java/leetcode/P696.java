package leetcode;

import java.util.ArrayList;

public class P696 {

	/*
	 * too slow
	 
	public static int countBinarySubstrings(String s) {
        int count = 0;
        int numL = 0, numR = 0;
        for(int i = 0; i < s.length() - 1; i++) {
        	for(int j = i + 1; j < s.length(); j+=2) {
        		numL = 0; numR = 0;
        		for(int k = i; k <= (j + i) / 2; k++) {
        			numL += s.charAt(k) - '0';
        		}
        		
        		for(int k = (j + i) / 2 +1; k <= j; k++) {
        			numR += s.charAt(k) - '0';
        		}
        		
        		if((numL == (j - i + 1) / 2 && numR == 0) || (numR == (j - i + 1) / 2 && numL == 0))
        		{
        			//System.out.println(s.substring(i, j+1));
        			count ++;
        			break;
        		}
        			
        	}
        }
        return count;
    }
    
	slow too
	public static int countBinarySubstrings(String s) {
        int count = 0;
        String str = "";
        int fromIndex = 0;
        int index = 0;
        for(int i = 0; i <= s.length(); i += 2) {
        	str = "1"+str+"0";
        	fromIndex = 0;
        	index = s.indexOf(str, fromIndex);
        	while(index != -1) {
        		count++;
        		index = s.indexOf(str, index+str.length());
        	}
        }
        
        str = "";
        fromIndex = 0;
        index = 0;
        for(int i = 0; i <= s.length(); i += 2) {
        	str = "0"+str+"1";
        	fromIndex = 0;
        	index = s.indexOf(str, fromIndex);
        	while(index != -1) {  		
        		count++;
        		index = s.indexOf(str, index+str.length());
        	}
        }
        return count;
    }
	*/
	
	public static int countBinarySubstrings(String s) {
        int count = 0;
        int count0 = 0;//number of '0' in every iteration
        int count1 = 0;//number of '1' in every iteration
        
        boolean flag = s.charAt(0) == '1';//true:counting '1', false:counting '0'
        int i = 0;
        char[] chars = s.toCharArray();
        int lastCount=0;
        //0101100110-->1 1 1 2 2 2 1
        while(i < chars.length) {
        	if(chars[i] == '1') {
        		if(flag) {
        			count1++;
        		} else {
        			//list.add(count0);
        			if(lastCount == 0) {
        				lastCount = count0;
        			} else {
        				count += lastCount>count0?count0:lastCount;
        				lastCount = count0;
        			}
        			count0 = 0;
        			flag=true;
        			count1++;
        		}
        		
        	} else {
        		if(flag) {
        			//list.add(count1);
        			if(lastCount == 0) {
        				lastCount = count1;
        			} else {
        				count += lastCount>count1?count1:lastCount;
        				lastCount = count1;
        			}
        			flag=false;
        			count1 = 0;
        			count0++;
        		} else {
        			
        			count0++;
        		}
        	}
        	i++;
        }
        
        
        if(flag)
        	count += lastCount>count1?count1:lastCount;
        else
        	count += lastCount>count0?count0:lastCount;

        return count;
	}
	
	public static void main(String[] args) {
		String a = "0101100110";
		System.out.println(countBinarySubstrings(a));
	}

}
