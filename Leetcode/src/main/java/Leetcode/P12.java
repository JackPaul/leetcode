package medium;

public class P12 {
    public String intToRoman(int num) {
        int i=0, j=0, k=0, l=0;
        String s1="", s2="", s3="", s4="";
        String s = num+"";
        if(num >= 1000) {
        	;
        } else if(num >= 100) {
        	s = "0" + s;
        } else if(num >= 10) {
        	s = "00" + s;
        } else {
        	s = "000" + s;
        }
        
    	i = s.charAt(0) - '0';
    	j = s.charAt(1) - '0';
    	k = s.charAt(2) - '0';
    	l = s.charAt(3) - '0';
    	s1 = trans(i, 1000);
    	s2 = trans(j, 100);
    	s3 = trans(k, 10);
    	s4 = trans(l, 1);
    	return s1 + s2 + s3 + s4;
    }

	private String trans(int num, int i) {
		switch(i) {
			case 1000: {
				switch(num) {
					case 0: return "";
					case 1: return "M";
					case 2: return "MM";
					case 3: return "MMM";
				}
			};break;
			
			case 100: {
				switch(num) {
					case 0: return "";
					case 1: return "C";
					case 2: return "CC";
					case 3: return "CCC";
					case 4: return "CD";
					case 5: return "D";
					case 6: return "DC";
					case 7: return "DCC";
					case 8: return "DCCC";
					case 9: return "CM";
				}
			};break;
			
			case 10: {
				switch(num) {
					case 0: return "";
					case 1: return "X";
					case 2: return "XX";
					case 3: return "XXX";
					case 4: return "XL";
					case 5: return "L";
					case 6: return "LX";
					case 7: return "LXX";
					case 8: return "LXXX";
					case 9: return "XC";
				}
			};break;
			
			case 1: {
				switch(num) {
					case 0: return "";
					case 1: return "I";
					case 2: return "II";
					case 3: return "III";
					case 4: return "IV";
					case 5: return "V";
					case 6: return "VI";
					case 7: return "VII";
					case 8: return "VIII";
					case 9: return "IX";
				}
			};break;
		}
		return null;
	}
}
