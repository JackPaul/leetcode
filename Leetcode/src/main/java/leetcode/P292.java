package leetcode;

public class P292 {

	public static boolean canWinNim(int n) {
        if(n %4 == 0) {
        	return false;
        } else {
        	return true;
        }
    }
	
	public static void main(String[] args) {
		System.out.println(canWinNim(44));
	}

}
