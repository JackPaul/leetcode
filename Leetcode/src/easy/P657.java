package easy;

public class P657 {

	public static boolean judgeCircle(String moves) {
        int[] pos = {0, 0};
        for(int i = 0; i <= moves.length()-1; i++) {
        	switch(moves.charAt(i)) {
        		case 'L':pos[0]++;break;
        		case 'R':pos[0]--;break;
        		case 'U':pos[1]++;break;
        		case 'D':pos[1]--;break;
        	}
        }
        
		return pos[0] == 0 && pos[1] == 0;
    }
	
	public static void main(String[] args) {
		
	}
}
