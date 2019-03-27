package leetcode;

public class P97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != s1.length() + s2.length())
            return false;
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        return isInterleaveHelper(c1, 0, c2, 0, c3, 0);
    }
    
    public boolean isInterleaveHelper(char[] c1, int i, char[] c2, int j, char[] c3, int k) {
        if(i > c1.length || j > c2.length)
            return false;
        if(i == c1.length && j == c2.length){
             if(k == c3.length)
                 return true;
             else
                 return false;
        }
        if(i == c1.length) {
            if(c2[j] != c3[k])
                return false;
            else 
                return isInterleaveHelper(c1, i, c2, j+1, c3, k+1);  
        }
        if(j == c2.length) {
            if(c1[i] != c3[k])
                return false;
            else
                return isInterleaveHelper(c1, i+1, c2, j, c3, k+1);
        }
        if(c1[i] != c3[k] && c2[j] != c3[k])
            return false;
        else if(c1[i] == c3[k] && c2[j] == c3[k])
            return isInterleaveHelper(c1, i+1, c2, j, c3, k+1) || isInterleaveHelper(c1, i, c2, j+1, c3, k+1);
        else if(c1[i] == c3[k])
            return isInterleaveHelper(c1, i+1, c2, j, c3, k+1);
        else
            return isInterleaveHelper(c1, i, c2, j+1, c3, k+1);
        /*
        if(i == c1.length && j == c2.length && k == c3.length)
            return true;
        if(i == c1.length && j == c2.length && k != c3.length){
            return false;
        }
        if(i > c1.length || j > c2.length || k > c3.length){
            return false;
        }
        
        if(i < c1.length && j < c2.length){
            if(c1[i] != c3[k] && c2[j] != c3[k])
                return false;
            else if(c1[i] == c3[k] && c2[j] == c3[k])
                return isInterleaveHelper(c1, i+1, c2, j, c3, k+1) || isInterleaveHelper(c1, i, c2, j+1, c3, k+1);
            else if(c1[i] == c3[k])
                return isInterleaveHelper(c1, i+1, c2, j, c3, k+1);
            else
                return isInterleaveHelper(c1, i, c2, j+1, c3, k+1);
        } else if(i < c1.length){
            if(c1[i] != c3[k])
                return false;
            else
                return isInterleaveHelper(c1, i+1, c2, j, c3, k+1);
        } else if(j < c2.length){
            if(c2[j] != c3[k])
                return false;
            else 
                return isInterleaveHelper(c1, i, c2, j+1, c3, k+1);
        } else
            return false;
         */    
    }

}
