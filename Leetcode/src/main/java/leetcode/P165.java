package leetcode;

public class P165 {
    public static int compareVersion(String version1, String version2) {
    	/*
    	int i = 0;
    	int j = 0;
    	while(i < version1.length() && j < version2.length()) {
    		if(version1.charAt(i) > version2.charAt(j))
    			return 1;
    		else if(version1.charAt(i) < version2.charAt(j))
    			return -1;
    		i++;j++;
    	}
        
        if(i != version1.length())
        	return 1;
        
        if(i == version1.length())
        	return -1;
        */
    	String[] s1 = version1.split("\\.");
    	String[] s2 = version2.split("\\.");
    	int[] n1 = new int[s1.length];
    	int[] n2 = new int[s2.length];
    	for(int i = 0; i < s1.length; i++) {
    		n1[i] = Integer.parseInt(s1[i]);
    	}
    	for(int i = 0; i < s2.length; i++) {
    		n2[i] = Integer.parseInt(s2[i]);
    	}
    	
    	int i = 0, j = 0;
    	while(i < n1.length && j < n2.length) {
    		if(n1[i] > n2[j])
    			return 1;
    		else if(n1[i] < n2[j])
    			return -1;
    		i++;j++;
    	}
        if(i != n1.length) {
        	for(int k = i; k < n1.length; k++) {
        		if(n1[k] != 0)
        			return 1;
        	}
        	return 0;
        }
        	
        
        if(j != n2.length){
        	for(int k = j; k < n2.length; k++) {
        		if(n2[k] != 0)
        			return 1;
        	}
        	return 0;
        }

        return 0;

    }
    
    public static void main(String[] args) {
		System.out.println(compareVersion("1.0", "1"));
	}
    
    
}
