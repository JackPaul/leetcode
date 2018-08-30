package easy;

public class P168 {

    public static String convertToTitle(int n) {
        String res = "";
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int i = -1;
        while(n > 26) {
        	i = n % 26;
        	
        	if(i == 0)
        		n = n - 26;
        	else
        		n = n - i;
        	System.out.println(n);
        	n = n / 26;
        	
        	if(i == 0)
        		res = res + "Z";
        	else
        		res = chars[(i+25) % 26] + res;
        	
        }
        
        if(n == 0)
        	return res;
        if(i == 0)
        	n--;
        res = chars[(n +25) % 26] + res;
        return res;
    }
    
    public static void main(String[] args) {
		
		System.out.println(convertToTitle(52));
	}

}
