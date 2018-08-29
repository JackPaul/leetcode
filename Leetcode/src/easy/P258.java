package easy;

public class P258 {

	public int addDigits(int num) {
        if(num % 9 == 0) {
        	return 9;
        } else {
        	return (num - 9 * (num / 9) + 9) % 9;	
        }
		
    }

}
