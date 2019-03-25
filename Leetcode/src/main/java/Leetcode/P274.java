package medium;

import java.util.Arrays;

public class P274 {

    public  static int hIndex(int[] citations) { 
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--) {
        	if(citations[i] <= citations.length - i)
        		return citations[i];
        }
        
        return citations.length;
    }
    
    public static void main(String[] args) {
		int citations[] = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}

}
