package leetcode;

public class P492 {

    public static int[] constructRectangle(int area) {
        int[] res = new int[2];
        int r = 0;
        for(int i = (int)Math.sqrt(area); i >= 1; i--) {
        	
        	if(area % i == 0) {
                r = area / i;
        		if(i >= r) {
        			res[0] = i;res[1] = r;
        		} else {
        			res[1] = i;res[0] = r;
        		}
        		break;
        	}
        }
        return res;
    }

    public static void main(String[] args) {
		System.out.println(constructRectangle(4));
	}
}
