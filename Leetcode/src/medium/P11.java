package medium;

public class P11 {
    public int maxArea(int[] height) {
        int res = 0;
        int area = 0;
        for(int i = 0; i <height.length; i++) {
        	for (int j = i+1; j < height.length; j++) {
				area = Math.min(height[i], height[j]) * (j - i);
				res = res < area?area:res;
			}
        }    
        return res;
    }
}
