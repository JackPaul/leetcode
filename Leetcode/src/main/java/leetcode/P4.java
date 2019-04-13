package leetcode;

import java.awt.*;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */

public class P4 {

	/*
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
    */

	/**
	 * 找到一个点i j = (m + n) / 2 - i;  使得  (a[0]-a[i], b[0]-b[j])  和 (a[i+1]-a[m], b[j+1]-b[n]) 满足：max((a[0]-a[i], b[0]-b[j])) <= min((a[i+1]-a[m], b[j+1]-b[n]))
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if(m > n) {
			return findMedianSortedArrays(nums2, nums1);
		}

		int left = 0, right = m;
		int i, j;
		while(left < right) {
			i = (left + right) / 2;
			j = (m + n) / 2 - i;
			if(nums1[i] <= nums2[j+1] && nums1[i+1] >= nums2[j]) {
				break;
			} else if(nums1[i] > nums2[j+1]) {
				right = i - 1;
			} else {
				left = i + 1;
			}
		}


		return 0;

	}
    public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {2,3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
		Color red = Color.RED;
	}
}
