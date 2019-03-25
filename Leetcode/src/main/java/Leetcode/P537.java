package medium;

public class P537 {
    public static String complexNumberMultiply(String a, String b) {
    	//²»ÄÜÊÇString[] nums1 = a.substring(0, a.length()-1).split("+");
        //String[] nums1 = a.substring(0, a.length()-1).split("\\+");	
        //String[] nums2 = a.substring(0, a.length()-1).split("\\+");
    	int n1 = a.lastIndexOf("+");
    	int n2 = b.lastIndexOf("+");

        int a1 = strToNum(a.substring(0, n1));
        int b1 = strToNum(a.substring(n1+1, a.length()-1));
        int a2 = strToNum(b.substring(0, n2));
        int b2 = strToNum(b.substring(n2+1, b.length()-1));
        
        int a3 = a1 * a2 - b1 * b2;
        int b3 = a1 * b2 + b1 * a2;
        return a3+"+"+b3+"i";
    }

	private static int strToNum(String s) {
		if(s.charAt(0) == '-') {
			return Integer.parseInt(s.substring(1)) * -1;
		}
		return Integer.parseInt(s);
		
	}
	
	public static void main(String[] args) {
		String a = "78+-76i";
		String b = "-86+72i";
		System.out.println(complexNumberMultiply(a, b));
		System.out.println("11+22+23".split("\\+")[0]);
	}
}
