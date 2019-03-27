package leetcode;

public class P806 {

	public int[] numberOfLines(int[] widths, String S) {
        int[] res = new int[2];
        int lines = 1;
        int currentWidth = 0;
        int i = 0;
        while(i < S.length()) {
        	currentWidth += widths[S.charAt(i) - 'a'];
        	if(currentWidth > 100) {
        		lines++;
        		currentWidth = 0;
        	} else if(currentWidth == 100) {
        		lines++;
        		currentWidth = 0;
        		i++;
        	}else {
        		i++;
        	}
        }
        res[0] = lines;
        res[1] = currentWidth;
		return res;
    }

}
