package easy;

public class P606 {
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public String tree2str(TreeNode t) {
        String res="";
        if(t == null)
        	return "";
        res = t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
        return res.replaceAll("\\(\\)", "");
    }
	
	public static void main(String[] args) {
		String s = "1(2(4()())())(3()())";
		System.out.println(s.replaceAll("\\(\\)", ""));
	}
}	
