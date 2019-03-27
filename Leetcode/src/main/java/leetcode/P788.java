package leetcode;

public class P788 {

	public static int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++) {
        	count += isGoodNum(i);
        }
        return count;
    }

	private static int isGoodNum(int i) {
		String originalNum = i+"";
		char[] CurrentStr = originalNum.toCharArray();
		for(int j = 0; j <= originalNum.length() - 1; j++) {
			switch(CurrentStr[j]) {
				case '3':case '4':case '7': return 0; 
				case '2':CurrentStr[j]='5';break;
				case '5':CurrentStr[j]='2';break;
				case '6':CurrentStr[j]='9';break;
				case '9':CurrentStr[j]='6';break;
			}
		}
		
		if(new String(CurrentStr).equals(originalNum)) {
			return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(rotatedDigits(10));
	}

}
