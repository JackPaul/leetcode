package medium;

public class P43 {
    public static String multiply(String num1, String num2) {
        if(num1.length() == 1 && num1.charAt(0) == '0')
        	return "0";
        if(num1.length() == 1 && num1.charAt(0) == '0')
        	return "0";
        
        String res = "0";
        String zeroSuffix = "";
        String currentSum="";
        
        for(int i = num2.length()-1; i >= 0; i--) {
        	currentSum="";
            int f = 0;
            int m = 0;
            int a = num2.charAt(i) - '0';
        	for(int j = num1.length()-1; j >= 0; j--) {
        		int b = num1.charAt(j) - '0';
        		//System.out.println(a+" "+b);
        		int c = (a * b + f) / 10;
        		m = (a * b + f) % 10;
        		f = c;
        		System.out.println(m);
        		currentSum = m + currentSum;	
        	}
        	if(f > 0)
        		currentSum = f + currentSum;
        	currentSum += zeroSuffix;
        	System.out.println(currentSum);
        	zeroSuffix += 0;
        }
        return "";
    }
    
    public static void main(String[] args) {
		System.out.println(multiply("567", "456"));
	}
}
