package easy;

public class P202 {

    public static boolean isHappy(int n) {
        int m = n;
        int total = 0;
        String str = m+"";

        while(m >= 10) {
        	total = 0;
        	for(char c :str.toCharArray()) {
        		total += (c - '0') * (c - '0');
        	}
        	m = total;
        	str = m+"";
        }
        
        return m == 1 || m == 7;
    }
    
    public static void main(String[] args) {
		System.out.println(isHappy(7));
	}
}
