package medium;

public class P60 {

    public String getPermutation(int n, int k) {
        String res = "";
        int num = sqn(n - 1);
        res = (k / num +1) + res;
        return res;
    }
    
    int sqn(int n) {
    	int total = 1;
    	for(int i = 2; i <= n; i++)
    		total *= i;
    	return total;
    }

}
