package medium;

import java.util.ArrayList;
import java.util.List;

public class P54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int h = matrix.length;
        int w = matrix[0].length;
        spiralTravelMatrix(matrix, 0, 0, w, h, res);
        return res;
    }

	private void spiralTravelMatrix(int[][] matrix, int i, int j, int w, int h, List<Integer> res) {
		if(w < 0 || h < 0)
			return ;
		
		
	}
}
