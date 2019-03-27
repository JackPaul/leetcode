package leetcode;

public class P43 {
    public static String multiply(String num1, String num2) {
        if(num1.length() == 1 && num1.charAt(0) == '0')
        	return "0";
        if(num2.length() == 1 && num2.charAt(0) == '0')
        	return "0";
        
        String res = "";
        String zeroSuffix = "";
        String currentSum="";
        
        for(int i = num2.length()-1; i >= 0; i--) {
        	currentSum="";
            int f = 0;
            int m = 0;
            int a = num2.charAt(i) - '0';
        	for(int j = num1.length()-1; j >= 0; j--) {
        		int b = num1.charAt(j) - '0';
        		int c = (a * b + f) / 10;
        		m = (a * b + f) % 10;
        		f = c;
        		currentSum = m + currentSum;	
        	}
        	if(f > 0)
        		currentSum = f + currentSum;
        	currentSum += zeroSuffix;
        	zeroSuffix += 0;
        	if(res.equals("")) {
        		res += currentSum;
        	} else {
        		int i1 = res.length() - 1;
        		int j1 = currentSum.length() - 1;
        		int flag = 0;
        		String sum = "";
        		while(i1 >= 0 && j1 >= 0) {
        			int a1 = res.charAt(i1) - '0';
        			int a2 = currentSum.charAt(j1) - '0';
            		int c = (a1 + a2 + flag) / 10;
            		m = (a1 + a2 + flag) % 10;
            		flag = c;
        			sum = m + sum;
        			i1--;
        			j1--;
        		}
        		
        		if(i1 == -1 && j1 == -1) {
        			if(flag > 0)
        				sum = flag + sum;
        		} else if(i1 == -1){
        			while(j1 >= 0) {
        				int a2 = currentSum.charAt(j1) - '0';
        				int c1 = (a2 + flag) / 10;
                		m = (a2 + flag) % 10;
                		flag = c1;
            			sum = m + sum;
            			j1--;
        			}
        			if(flag > 0)
        				sum = flag + sum;
        		} else {
        			while(i1 >= 0) {
        				int a1 = res.charAt(i1) - '0';
        				int c1 = (a1 + flag) / 10;
                		m = (a1 + flag) % 10;
                		flag = c1;
            			sum = m + sum;
            			i1--;
        			}
        			if(flag > 0)
        				sum = flag + sum;
        		}
        		res = sum;
        	}
        }
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(multiply("123456789", "987654321"));
	}
}
