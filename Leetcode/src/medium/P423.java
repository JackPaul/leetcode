package medium;

public class P423 {
    public String originalDigits(String s) {
        
        int[] charMap = new int[26];
        int[] digitNum = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
        	charMap[c - 'a']++;
        }
        
        if(charMap[25] > 0) {
        	digitNum[0] = charMap[25];
        	
        	charMap['e'-'a'] -= charMap[25];
        	charMap['r'-'a'] -= charMap[25];
        	charMap['o'-'a'] -= charMap[25];
        	charMap[25] = 0;
        }
        
        if(charMap['g'-'a'] > 0) {
        	digitNum[8] = charMap['g'-'a'];
        	charMap['e'-'a'] -= charMap['g'-'a'];
        	charMap['i'-'a'] -= charMap['g'-'a'];
        	charMap['h'-'a'] -= charMap['g'-'a'];
        	charMap['t'-'a'] -= charMap['g'-'a'];
        	charMap['g'-'a'] = 0;
        }
        
        if(charMap['x'-'a'] > 0) {
        	digitNum[6] = charMap['x'-'a'];
        	charMap['i'-'a'] -= charMap['x'-'a'];
        	charMap['s'-'a'] -= charMap['x'-'a'];
        	charMap['x'-'a'] = 0;
        }
        
        
        if(charMap['w'-'a'] > 0) {
        	digitNum[2] = charMap['w'-'a'];
        	charMap['t'-'a'] -= charMap['w'-'a'];
        	charMap['o'-'a'] -= charMap['w'-'a'];
        	charMap['w'-'a'] = 0;
        }
        
        if(charMap['t'-'a'] > 0) {
        	digitNum[3] = charMap['t'-'a'];
        	charMap['h'-'a'] -= charMap['t'-'a'];
        	charMap['r'-'a'] -= charMap['t'-'a'];
        	charMap['e'-'a'] -= charMap['t'-'a'] * 2;
        	charMap['t'-'a'] = 0;
        }
        
        if(charMap['r'-'a'] > 0) {
        	digitNum[4] = charMap['r'-'a'];
        	charMap['f'-'a'] -= charMap['r'-'a'];
        	charMap['o'-'a'] -= charMap['r'-'a'];
        	charMap['u'-'a'] -= charMap['r'-'a'];
        	charMap['r'-'a'] = 0;
        }
        
        if(charMap['f'-'a'] > 0) {
        	digitNum[5] = charMap['f'-'a'];
        	charMap['i'-'a'] -= charMap['f'-'a'];
        	charMap['v'-'a'] -= charMap['f'-'a'];
        	charMap['e'-'a'] -= charMap['f'-'a'];
        	charMap['f'-'a'] = 0;
        }
        
        if(charMap['s'-'a'] > 0) {
        	digitNum[7] = charMap['s'-'a'];
        	charMap['e'-'a'] -= charMap['s'-'a'] * 2;
        	charMap['v'-'a'] -= charMap['s'-'a'];
        	charMap['n'-'a'] -= charMap['s'-'a'];
        	charMap['s'-'a'] = 0;
        }
        
        
        if(charMap['o'-'a'] > 0) {
        	digitNum[1] = charMap['o'-'a'];
        	charMap['n'-'a'] -= charMap['o'-'a'];
        	charMap['e'-'a'] -= charMap['o'-'a'];
        	charMap['o'-'a'] = 0;
        }
        
        if(charMap['n'-'a'] > 0) {
        	digitNum[9] = charMap['n'-'a'] / 2;
        	charMap['i'-'a'] -= charMap['n'-'a'] / 2;
        	charMap['e'-'a'] -= charMap['n'-'a'] / 2;
        	charMap['n'-'a'] = 0;
        }
        
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < digitNum[i]; j++)
        		sb.append(i+"");
        }
        return sb.toString();
    }
    
   
}
