package easy;

public class P171 {

    public static int titleToNumber(String s) {
        int res = 0;
        int m = 1;
        for(int i = s.length() - 1; i >= 0 ; i--) {
        	res += m * (s.charAt(i) - 64);
        	m *= 26;
        } 
        return res;
    }

    public static void main(String[] args) {
		System.out.println(titleToNumber("ZY"));
	}
}
