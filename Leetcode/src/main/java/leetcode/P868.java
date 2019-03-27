package leetcode;

public class P868 {

public static int binaryGap(int N) {
    int distance=0;
    int currentDistance=0;
    int i;
    int countI=0;
	while(N > 0) {
		i = N & 1;
		if(i == 1 && currentDistance == 0) {
			countI++;
			currentDistance = 1;
		} else if(i == 1 && currentDistance != 0) {
			countI++;
			distance = currentDistance>distance?currentDistance:distance;
			currentDistance = 1;
		} else if(i == 0 && countI > 0) {
			currentDistance++;
		}
		
		N = N >> 1;
	}
    
	return distance;
    }


	public static void main(String[] args) {
		System.out.println(binaryGap(6));
	}
}
