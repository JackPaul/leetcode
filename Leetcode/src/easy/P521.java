package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class P521 {

	public static int findLUSlength(String a, String b) {
        
        Set<String> subSequences = getSubSequences(a);
        Set<String> subSequences2 = getSubSequences(b);
        Set<String> subSequences3 = new HashSet<>();
        Set<String> subSequences4 = new HashSet<>();
        int maxLength = -1;
        subSequences3.addAll(subSequences);
        subSequences3.retainAll(subSequences2);
        subSequences4.addAll(subSequences);
        subSequences4.addAll(subSequences2);
        subSequences4.removeAll(subSequences3);
        for(String str : subSequences4) {
    		if(str.length() > maxLength) {
    			maxLength = str.length();
    		}
        }
		return maxLength;
    }
	
	public static Set<String> getSubSequences(String s) {
		Set<String> subSequences = new HashSet<>();
		Set<String> currentSubSequences = new HashSet<>();
		subSequences.add("");
		for(int i = s.length()-1; i >= 0; i--) {
			for(String str : subSequences) {
				currentSubSequences.add(s.charAt(i)+""+str);
			}
			subSequences.addAll(currentSubSequences);
			currentSubSequences.clear();
		}
		return subSequences;
	}
	
	public static void main(String[] args) {
		//System.out.println(findLUSlength("horbxeemlgqpqbujbdagizcfairalg"
		//		,"iwvtgyojrfhyzgyzeikqagpfjoaeen"));
		//System.out.println(getSubSequences("horbxeemlgqpqbujbdagizcfairalg"));
				
	}
}
