package leetcode;

public class P812 {

	public static double largestTriangleArea(int[][] points) {
        double res=0.0;
        double area = 0.0;
        for(int i = 0; i <= points.length - 3; i++) {
        	for(int j = i + 1; j <= points.length - 2; j++) {
        		for(int k = j + 1; k <= points.length - 1; k++) {
        			area = calculateArea(points[i], points[j], points[k]);
        			res = res > area?res:area;
        		}
        	}
        }
        return res;
    }
	
	public static double calculateArea(int[] a, int[] b, int[] c) {

		double l1 = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
		double l2 = Math.sqrt((a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]));
		double l3 = Math.sqrt((c[0] - b[0]) * (c[0] - b[0]) + (c[1] - b[1]) * (c[1] - b[1]));
		double p = (l1 + l2 + l3) / 2;
		if(!(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1)) {
			return 0.0;
		}
		double area = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
		return Math.abs(area);
	}
	
	public static void main(String[] args) {
		int[][] a = {{0,0},{0,1},{1,0},{0,2},{2,0}};
		
		System.out.println(largestTriangleArea(a));
	}

}
