package easy;

public class P733 {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] flags = new int[image.length][image[0].length];
        flood(image, sr, sc, flags);
        for(int i = 0; i < image.length; i++)
        	for(int j = 0; j <= image[0].length; j++) {
        		if(flags[i][j] == 1)
        			image[i][j] = newColor;
        	}
        return image;
    }

	private void flood(int[][] image, int sr, int sc, int[][] flags) {
		if(sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && flags[sr][sc] == 0) {
			flags[sr][sc] = 1;
			if(sc > 0 && image[sr][sc-1] == image[sr][sc])
				flood(image, sr, sc-1, flags);
			if(sc < image[0].length-1 && image[sr][sc+1] == image[sr][sc])
			flood(image, sr, sc+1, flags);
			if(sr > 0 && image[sr-1][sc] == image[sr][sc])
				flood(image, sr-1, sc, flags);
			if(sr < image.length-1 && image[sr+1][sc] == image[sr][sc])
			flood(image, sr+1, sc, flags);
		}
		
	}
	
	

}
