package easy;

public class P168 {

    public static String convertToTitle(int n) {
        String res = "";
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int i = 0;
        while(n > 26) {
        	i = n % 26;
        	n = n / 26;
        	res = chars[(i+25) % 26] + res;
        }
        if(n == 0)
        	res = "Z"+res;
        else
        	res = chars[(n +25) % 26] + res;
        //res = chars[(n - 1 +25) % 26] + res;
        return res;
    }
    
    public static void main(String[] args) {
		
		System.out.println(convertToTitle(52));
	}
    
//    public static void main(String[] args) {
//		System.out.println(-1 % 26);
//	}
}
