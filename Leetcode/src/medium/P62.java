package medium;

public class P62 {
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        if(m == 2 && n == 2)
            return 2;

        return uniquePaths(m, n - 1) + uniquePaths(m - 1,  n);
    }
    
    public static void main(String[] args) {
		System.out.println(uniquePaths(51, 9));
	}
}
