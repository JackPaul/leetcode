package easy;

public class P458 {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int res = 0;
        int times = minutesToTest / minutesToDie;
        res = (buckets) / times ;
        return res;  
    }

}
