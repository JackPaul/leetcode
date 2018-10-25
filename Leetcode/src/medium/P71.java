package medium;

public class P71 {
    public static String simplifyPath(String path) {
        String sb = "/";
        char[] arr = path.toCharArray();
        int i = 0;
        boolean f1 = true;//前面是/
        boolean f2 = false;//前面是/.
        boolean f3 = false;//前面是alphabet
        while(i < path.length()) {
        	if(arr[i] != '/' && arr[i] != '.') {
        		if(f1)
        			sb += "/";
        		sb += arr[i];
        		i++;
        		f3 = true;
        		f1 = false;
        		f2 = false;
        	} else if(arr[i] == '/') {
        		if(!f3) {
        			if(!f1)
        				f1 = true;
        			else
        				f1 = true;
        		}
        	} else {
        		if(f2) {
        			int p = sb.lastIndexOf("/");
        			sb = sb.substring(0, p + 1);
        			f2 = false;
        			f1 = true;
        			f3 = false;
        		}
        		if(f1) {
        			f2 = true;
        			f1 = false;
        			f3 = false;
        		}
        	}
        	i++;
        }
        return sb;
    }
    
    public static void main(String[] args) {
		System.out.println(simplifyPath("/a/./b/../../c/"));
	}
}
