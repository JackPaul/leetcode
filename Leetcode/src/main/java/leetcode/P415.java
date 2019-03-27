package leetcode;

public class P415 {

    public static String addStrings(String num1, String num2) {
        String res = "";
        int flag = 0;
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int i = n1.length-1, j = n2.length-1;
        while(i >= 0 && j >= 0) {
        	res =  (flag + n1[i] + n2[j] - '0' - '0') % 10 + res;
        	flag = (flag + n1[i] + n2[j] - '0' - '0') / 10;
        	i--;j--;
        }
        
        while(i >= 0) {
        	res =  (flag + n1[i] - '0') % 10 + res;
        	flag = (flag + n1[i] - '0') / 10;
        	i--;
        }
        
        while(j >= 0) {
        	res =  (flag + n2[j] - '0') % 10 + res;
        	flag = (flag + n2[j] - '0') / 10;
        	j--;
        }
        if(flag == 1)
        	res = "1"+res;
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(addStrings("9", "11"));
	}

}
