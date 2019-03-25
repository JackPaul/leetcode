package easy;

public class P824 {

	public static String toGoatLatin(String S) {	
		String[] words = S.split(" ");
		String w;
		String res="";
		for(int i = 0; i < words.length; i++) {
			w = words[i];
			System.out.println(w);
			if(!(w.toLowerCase().charAt(0) == 'a' || w.toLowerCase().charAt(0) == 'e' || 
					w.toLowerCase().charAt(0) == 'i' || w.toLowerCase().charAt(0) == 'o' ||
					w.toLowerCase().charAt(0) == 'u')) {
				words[i] = words[i].substring(1, words[i].length()) + words[i].charAt(0);
			}
			words[i] += "ma";
			for(int j = 0; j <= i; j++) {
				words[i] += "a";
			}
			if(i != words.length - 1)
				res += words[i]+" ";
			else
				res += words[i];
		}

		return res;
    }
	
	public static void main(String[] args) {
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}

}
