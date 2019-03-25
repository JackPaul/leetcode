package medium;

import java.util.ArrayList;
import java.util.List;

public class P54 {
	
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0)
        	return res;
        int h = matrix.length;
        int w = matrix[0].length;
        spiralTravelMatrix(matrix, 0, 0, h, w, res);
        return res;
    }

	private static void spiralTravelMatrix(int[][] matrix, int i, int j, int h, int w, List<Integer> res) {
		if(w <= 0 || h <= 0)
			return ;
		if(w == 1 && h == 1) {
			res.add(matrix[i][j]);
		} else if(w == 1) {
			for(int k = i; k < i + h; k++)
				res.add(matrix[k][i]);
		} else if(h == 1) {
			for(int k = j; k < j + w; k++)
				res.add(matrix[i][k]);
		} else {
			//Ë³Ê±Õë±éÀúÒ»È¦
			for(int k = j; k < j + w; k++)
				res.add(matrix[i][k]);
			res.remove(res.size()-1);
			for(int k = i; k < i + h; k++)
				res.add(matrix[k][j + w - 1]);
			res.remove(res.size()-1);
			for(int k = j + w - 1; k >= j; k--)
				res.add(matrix[i + h - 1][k]);
			res.remove(res.size()-1);
			for(int k = i + h - 1; k >= i; k--)
				res.add(matrix[k][j]);
			res.remove(res.size()-1);
			spiralTravelMatrix(matrix, i+1, j+1, h-2, w-2, res);
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(spiralOrder(matrix));
	}
}
