package hard;

public class P4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	if(nums1.length < 1) {
    		int len = nums2.length;
            if(len % 2 != 0)
            	return nums2[len / 2];
            else
            	return (double)(nums2[len / 2] + nums2[(len / 2) - 1]) / 2;
    	}
    	
    	if(nums2.length < 1) {
    		int len = nums1.length;
            if(len % 2 != 0)
            	return nums1[len / 2];
            else
            	return (double)(nums1[len / 2] + nums1[(len / 2) - 1]) / 2;
    	}
    	
    	int len = nums1.length + nums2.length;
        int[] nums3 = new int[len];
        
        
        int i = 0, j = 0, index = 0;
        
        while(i < nums1.length && j < nums2.length) {
        	if(nums1[i] <= nums2[j]) {
        		nums3[index++] = nums1[i++];
        	} else {
        		nums3[index++] = nums2[j++];
        	}
        }
        
        if(i == nums1.length && j == nums2.length) {
        	;
        } else if(i == nums1.length) {
        	for(int l = j; l < nums2.length; l++) {
        		nums3[index++] = nums2[l];
        	}
        } else {
        	for(int l = i; l < nums1.length; l++) {
        		nums3[index++] = nums1[l];
        	}
        }
        if(len % 2 != 0)
        	return nums3[len / 2];
        return (double)(nums3[len / 2] + nums3[(len / 2) - 1]) / 2;
    }
    
    public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {2,3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
