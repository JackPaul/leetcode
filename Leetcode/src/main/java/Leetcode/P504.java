package easy;

public class P504 {

    public String convertToBase7(int num) {
       if(num == 0) 
    	   return "0"; 
       String flag = "";
       if(num < 0) {
    	   flag += "-";
    	   num = num * -1;
       }
    	   
       
       String res = "";
       while(num > 0) {
    	   res = num % 7 + ""+res;
    	   num = num / 7;
       }
       
       return flag+res;
    }

}
