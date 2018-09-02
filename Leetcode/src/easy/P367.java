package easy;

public class P367 {
	public boolean isPerfectSquare(int num) {
		int k = num % 10;
		if(k == 2 || k == 3 || k == 7 || k == 8)
			return false;
		int i = 0, j = 0;
		if(num % 2 != 0)
			j = 1;
		for(i = j; i * i < num; i+=2) 
			;
		return i * i == num;
	}
}
