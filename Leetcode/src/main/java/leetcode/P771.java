package leetcode;

public class P771 {

    public static int numJewelsInStones(String J, String S) {
//        int count = 0;
//        char c;
//        for(int i = 0; i < J.length(); i++){
//            c = J.charAt(i);
//            for(int j = 0; j < S.length(); j++){
//                if(c == S.charAt(j)){
//                    count++;
//                }
//            }
//        }
//        return count;
    	
    	int count = 0;
    	boolean[] flags = new boolean[128];
    	for(int i = 0; i < J.length(); i++) {
    		flags[J.charAt(i)] = true;
    	}
    	for(int j = 0; j < S.length(); j++) {
    		if(flags[S.charAt(j)]) {
    			count++;
    		}
    	}

    	return count;
    }

    public static void main(String[] args) {

		System.out.println(numJewelsInStones("aA", "aaAdd"));
	}

}
