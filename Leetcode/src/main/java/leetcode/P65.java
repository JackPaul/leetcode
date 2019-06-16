package leetcode;

public class P65 {

    //A[.[B]][eC] 或者 .B[eC]
    public boolean isNumber(String s) {
        s = s.trim();
        int posPoint = -1;
        int posExponent = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                if(posPoint == -1) {
                    posPoint = i;
                } else {
                    return false;
                }
            } else if(s.charAt(i) == 'e'){
                if(posExponent == -1) {
                    posExponent = i;
                } else {
                    return false;
                }
            } else if(((s.charAt(i) < '0' || s.charAt(i) > '9') && s.charAt(i) != '+' && s.charAt(i) != '-')) {
                return false;
            }
        }
        if (posExponent != -1 && (posPoint > posExponent || posExponent == 0) || posExponent == s.length() - 1) {
            return false;
        }

        //A[.[B]][eC] 或者 .B[eC]
        if(posExponent != -1 && posPoint != -1) {
            String s1 = s.substring(0, posPoint);
            String s2 = s.substring(posPoint + 1, posExponent);
            String s3 = s.substring(posExponent + 1);
            if(s1.length() == 0 && s2.length() == 0) {
                return false;
            }
            return isSignedNumber(s3) && isNumber(s.substring(0, posExponent));
            //boolean flag = s.substring(posPoint + 1, posExponent).length() == 0?true:isUnsignedNumber(s.substring(posPoint + 1, posExponent));
            //return isSignedNumber(s.substring(0, posPoint)) && isUnsignedNumber(s.substring(posPoint + 1, posExponent)) && isSignedNumber(s.substring(posExponent + 1));
        } else if (posExponent != -1) {
            return isSignedNumber(s.substring(0, posExponent)) && isSignedNumber(s.substring(posExponent + 1));
        } else if (posPoint != -1) {
            String s1 = s.substring(0, posPoint);
            String s2 = s.substring(posPoint + 1);
            if(s1.length() == 0 && s2.length() == 0) {
                return false;
            } else if(s1.length() == 0) {
                return isUnsignedNumber(s2);
            } else if (s2.length() == 0){
                return isSignedNumber(s1);
            } else {
                if(s1.length() == 1 && (s1.charAt(0) == '+' || s1.charAt(0) == '-')) {
                    return isUnsignedNumber(s2);
                }
                return isUnsignedNumber(s2) && isSignedNumber(s1);
            }
        } else {
            return isSignedNumber(s);
        }
    }

    private boolean isSignedNumber(String s) {
        if (s.length() == 0) {
            return true;
        }
        if((s.charAt(0) < '0' || s.charAt(0) > '9') && s.charAt(0) != '+' && s.charAt(0) != '-') {
            return false;
        }

        if (s.length() == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-')) {
            return false;
        }
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    private boolean isUnsignedNumber(String s) {
        if (s.length() == 0) {
            return true;
        }
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
