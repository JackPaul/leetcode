package leetcode;

public class P717 {

    public static  boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1)
        	return true;
        else if (bits.length == 2) {
        	return false;   	
        } 
        else {
        	int i = 0;
        	int j = i;
        	while(i < bits.length-1) {
        		j = i;
        		if(bits[i] == 1) {
        			if(bits[i+1] == 0) {
        				i += 2;
        			} else {
        				i += 2;
        			}
        		} else {
        			if(bits[i+1] == 0) {
        				i += 2;
        			} else {
        				i += 1;
        			}
        		}
        	}
        	
        	if(i == bits.length - 1) {
        		return true;
        	} else {
        		return bits[j] == 0;
        	}
        }
    }
    
    public static void main(String[] args) {
		int[] a = {1,1,0,0};
		System.out.println(isOneBitCharacter(a));
	}
}
