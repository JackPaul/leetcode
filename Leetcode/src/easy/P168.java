package easy;

public class P168 {

    public static String convertToTitle(int n) {
        String res = "";
        char[] chars = "ZABCDEFGHIJKLMNOPQRSTUVWXY".toCharArray();
        int i = 0;
        while(n > 0) {
        	i = n % 26;
        	n = n / 26;
        	res = chars[i] + res;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
		
		System.out.println(convertToTitle(52));
	}

}
