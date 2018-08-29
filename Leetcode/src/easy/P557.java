package easy;

public class P557 {

//	public String reverseWords(String s) {
//      
//		String res = "";
//		for(String word:s.split(" ")) {
//			res += new StringBuilder(word).reverse().toString()+" ";
//		}
//		return res.substring(0, res.length()-1);
//    }
	
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String res = "";
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				sb.insert(0, c);
			} else {
				sb.append(c);
				res += sb.toString();
				sb.delete(0, sb.length());
			}
			
		}
		res += sb.toString();
		return res;
	}
	
	public static void main(String[] args) {
		reverseWords("ab cd");
	}

}
