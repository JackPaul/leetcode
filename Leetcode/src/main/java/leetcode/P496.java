package leetcode;

public class P496 {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        boolean isFound=false;
        int g = -1;
        for(int i = 0; i < nums1.length; i++) {
        	
        	isFound=false;
        	g = -1;
        	for(int j = 0; j < nums2.length; j++) {
        		if(nums2[j] == nums1[i]) {
        			isFound = true;
        		}
        		if(isFound && nums2[j] > nums1[i]) {
        			g = nums2[j]; 
        			break;
        		}
        	}
        	res[i] = g;
        }
        return res;
    }

}
