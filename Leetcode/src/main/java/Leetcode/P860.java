package easy;

public class P860 {

    public boolean lemonadeChange(int[] bills) {
        int num5 = 0;
        int num10 = 0;
        for(int i = 0; i < bills.length; i++) {
        	if(bills[i] == 5) {
        		num5++;
        	} else if(bills[i] == 10 && num5 <= 0) {
        		return false;
        	} else if(bills[i] == 10 && num5 > 0) {
        		num5--;
        		num10++;
        	} else if(bills[i] == 20) {
        		if(num5 < 0) {
        			return false;
        		} else if(num5 >= 3) {
    				if(num10 > 0) {
    					num10 -= 1;
    					num5 -= 1;
    				} else {
    					num5 -= 3;
    				}
        		} else {
        			if(num10 > 0) {
    					num10 -= 1;
    					num5 -= 1;
    				} else {
    					return false;
    				}	
        		}
        	}
        }
        
        return true;
    }

}
