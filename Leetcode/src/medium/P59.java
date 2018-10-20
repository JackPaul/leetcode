package medium;

public class P59 {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int i = 1;
        int num = n * n;
        int x = 0, y = 0;
        int j = x;
        int k = y;
        int d = n - 1;//维度
        int direc = 0;
        while(i <= num) {
        	if(direc == 0) {
        		res[j][k] = i;
        		k++;
        		i++;
        		if(k == d) {
        			direc = (direc +1) % 4;
        		}
        	} else if(direc == 1) {
        		res[j][k] = i;
        		j++;
        		i++;
        		if(j == d) {
        			direc = (direc +1) % 4;
        		}
        		
        	} else if(direc == 2) {
        		res[j][k] = i;
        		k--;
        		i++;
        		if(k == y) {
        			direc = (direc +1) % 4;
        		}
        	} else if(direc == 3) {
        		res[j][k] = i;
        		j--;
        		i++;
        		if(j == x) {
        			direc = (direc +1) % 4;
        			x++;
        			y++;
        			j = x;
        			k = y;
        			d = d - 1;
        		}
        	}
        }
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(generateMatrix(2));
	}
}
