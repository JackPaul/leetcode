package leetcode;

public class P507 {

	//Time Limit Exceeded
	/*
    public static boolean checkPerfectNumber(int num) {
        int total = 1;
        for(int i = 2; i < num; i++)
        		total += num%i==0?i:0;
        return total == num;
    }
	*/
	
    public static boolean checkPerfectNumber(int num) {
        int total = 1;
        for(int i = 2; i < Math.sqrt(num); i++) {
        	if(num % i == 0) {
        		total += i + num / i;
        	}
        }
        
        if((int)Math.sqrt(num) * (int)Math.sqrt(num) == num)
        	total += (int)Math.sqrt(num);
        return total == num;
    }

}
