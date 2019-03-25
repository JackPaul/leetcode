package easy;

import java.util.ArrayList;
import java.util.List;

public class P401 {

    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int hourLEDs = 0;
        int minuteLEDs = 0;
        
        List<Integer[]> list = new ArrayList<>();
        Integer[] arr = null;
        while(hourLEDs <= 3 && hourLEDs <= num) {
        	arr = new Integer[2];
        	arr[0] = hourLEDs;
        	arr[1] = num - hourLEDs;
        	if(num - hourLEDs <= 5 && num - hourLEDs <= num)
        	list.add(arr);
        	hourLEDs++;
        }
        List<String[]> prefix = new ArrayList<>();
        List<String[]> suffix = new ArrayList<>();
        
        String[] h0 = {"0"};
        String[] h1	= {"1", "2", "4", "8"};
        String[] h2	= {"3", "5", "9", "6", "10"};
        String[] h3	= {"7", "11"};

       
        String[] m0 ={"00"};
        String[] m1 = {"01", "02", "04", "08", "16", "32"}; 
        String[] m2 = {"03","05","09","17","33","06","10","18","34","12","20","36","24","40","48"};
        String[] m3 = {"07","11","19","35","13","21","37","25","41","49","14","22","38","26","42","50","28","44","52","56"}; 
        String[] m4 = {"15","23","39","27","43","51","29","45","53","57","30","46","54","58"};
        String[] m5 = {"31", "47", "55", "59"};
        
        prefix.add(h0);prefix.add(h1);prefix.add(h2);prefix.add(h3);
        suffix.add(m0);suffix.add(m1);suffix.add(m2);suffix.add(m3);
        suffix.add(m4);suffix.add(m5);
        
        for(Integer[] a : list) {
        	hourLEDs = a[0]; minuteLEDs = a[1];
        	for(int i = 0; i < prefix.get(hourLEDs).length; i++) {
        		for(int j = 0; j < suffix.get(minuteLEDs).length; j++) {
        			res.add(prefix.get(hourLEDs)[i] + ":"+suffix.get(minuteLEDs)[j]);
        		}
        	}
        }
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(readBinaryWatch(6));
	}
}