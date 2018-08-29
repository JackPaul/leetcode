package easy;

public class P836 {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1[0] == rec2[0] && rec1[1] == rec2[1] && rec1[2] == rec2[2] && rec1[3] == rec2[3])
        	return true;
    	int x11 = rec1[0], x12 = rec1[2], x13 = rec1[0], x14 = rec1[2];
        int y11 = rec1[3], y12 = rec1[3], y13 = rec1[1], y14 = rec1[1]; 
        int x21 = rec2[0], x22 = rec2[2], x23 = rec2[0], x24 = rec2[2];
        int y21 = rec2[3], y22 = rec2[3], y23 = rec1[1], y24 = rec2[1]; 
        
        if(in(rec1, x21, y21) || in(rec1, x22, y22) || in(rec1, x23, y23) 
        		|| in(rec1, x24, y24) || in(rec2, x11, y11) || in(rec2, x12, y12) ||
        		in(rec2, x13, y13) || in(rec2, x14, y14)) {
        	return true;
        } else
        	return false;
       
    }

	public boolean in(int[] rec, int x, int y) {
		if(x < rec[2] && x > rec[0] && y < rec[3] && y < rec[1])
			return true;
		return false;
	}

}
