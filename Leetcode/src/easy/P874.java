package easy;

public class P874 {



	public static int robotSim(int[] commands, int[][] obstacles) {
		int d = 0;//0 1 2 3代表+y +x -y -x方向
		int x = 0, y = 0;
		int x1 = 0, y1 = 0;
		int max = 0;
		int cur = 0;
		for(int num : commands) {
			if(num == -1) {
				d = (d + 1) % 4;
			} else if(num == -2) {
				d = (d + 3) % 4;
			} else {
				//
				switch(d) {
					case 0:{
						
						y1 = y + num;
						int minY = y1+1;
						for(int[] p : obstacles) {
							if(p[0] == x && p[1] > y && p[1] <= y1) {
								if(p[1] < minY) {
									minY = p[1];
								}
							}
						}
						y = minY-1;

					};break;
					
					case 1:{
						x1 = x + num;
						int minX = x1+1;
						for(int[] p : obstacles) {
							if(p[1] == y && p[0] > x && p[0] <= x1) {
								if(p[0] < minX) {
									minX = p[0];
								}
							}
						}
						x = minX-1;

					};break;
					
					case 2:{
						y1 = y - num;
						int minY = y1-1;
						for(int[] p : obstacles) {
							if(p[0] == x && p[1] >= y1 && p[1] < y) {
								if(p[1] > minY) {
									minY = p[1];
								}
							}
						}
						y = minY+1;

					};break;
					
					case 3:{
						x1 = x - num;
						int minX = x1-1;
						for(int[] p : obstacles) {
							if(p[1] == y && p[0] >= x1 && p[0] < x) {
								if(p[0] > minX) {
									minX = p[0];
								}
							}
						}
						x = minX+1;
					};break;
					
				}
				cur = x * x + y * y;
				max = max < cur?cur:max;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] commands = {-2,-1,4,7,8};
				
		
		int[][] obstacles = {{1,1},{2,1},{4,4},{5,-5},{2,-3},{-2,-3},{-1,-3},{-4,-1},{-4,3},{5,1}};
		System.out.println(robotSim(commands, obstacles));
	}
}
