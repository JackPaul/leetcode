package leetcode;

public class P849 {
    public static int maxDistToClosest(int[] seats) {

        int low = -1;
        int len = 0;
        int[] pos = new int[2];
        int maxDistance = 0;
        boolean flag = false;
        int i;
        for(i = 0; i < seats.length; i++) {
        	if(seats[i] == 0) {
        		if(!flag) {
        			low = i;
        			flag = true;
        			len++;
        		} else {
        			len++;
        		}
        	} else {
        		if(flag) {
        			flag = false;

        			if(maxDistance < len) {
        				if(pos[0] == 0) {
        					if((i - low) / 2 > pos[1]) {
                				maxDistance = len;
                				pos[0] = low;
                				pos[1] = i - 1;
        					}
        		
        				} else {
            				maxDistance = len;
            				pos[0] = low;
            				pos[1] = i - 1;
        				}

        			}
        			
        		
        			len = 0;
        		} else {
        	        if(low == 0) {
        	        	if(maxDistance < len) {
            				if(pos[0] == 0) {
            					if((i - low) / 2 > pos[1]) {
                    				maxDistance = len;
                    				pos[0] = low;
                    				pos[1] = i - 1;
            					}
            		
            				} else {
                				maxDistance = len;
                				pos[0] = low;
                				pos[1] = i - 1;
            				}

            			}
        	        }
        	        	
        		}
        	}
        }
        
        if(flag) {
        	len = i - low;
        	if(pos[0] == 0) {
        		if(maxDistance >= len) {
        			return pos[1] + 1;
        		}
        	}
			if(len > (maxDistance / 2)) {
					return i - low;

			}
        }
        
        if(pos[0] == 0)
        	return 1 + pos[1];
        
        return 1 + (pos[1] - pos[0]) / 2;
    }
    
    public static void main(String[] args) {
		int[] a = {0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1};
		System.out.println(maxDistToClosest(a));
	}
}
