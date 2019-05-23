package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-18 20:41
 * @Description:
 */
public class P299 {
    public String getHint(String secret, String guess) {
        int[] mapInteger1 = new int[10];
        int[] mapInteger2 = new int[10];
        int B = 0;
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                B++;
            } else {
                mapInteger1[secret.charAt(i) - '0']++;
                mapInteger2[guess.charAt(i) - '0']++;
            }
        }
        int C = 0;
        for(int i = 0; i < 10; i++) {
            C += Math.min(mapInteger1[i], mapInteger2[i]);
        }

        return B+"A"+C+"B";
    }
}
