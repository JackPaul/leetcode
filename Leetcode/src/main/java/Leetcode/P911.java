package medium;

public class P911 {
	private int[] persons = null;
	private int[] times = null;
	private int[] leaders = null;
    public P911(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;
    	leaders = new int[persons.length];
    	int[] personVotes = new int[persons.length+1];
        int max=0;
        int pos=0;
    	for(int i = 0; i < persons.length; i++) {
        	personVotes[persons[i]]++;
        	if(personVotes[persons[i]] >= max) {
        		max = personVotes[persons[i]];
        		pos = persons[i];
        	}
    		leaders[i] = pos;
    	}
    }
 
    public int q(int t) {
    	//将每个时间节点的leader选出来
    	if(t > times[times.length-1])
    		return leaders[times.length-1];
    	//二分查找 应该t在times中应该插入的位置 
        return leaders[bisearch(times,0, times.length-1, t)];
    }
    
    private int bisearch(int[] arr, int low, int high, int val) {

    	int mid = (low + high)/2;
        if(low <= high){
          if( arr[mid] == val){
            return mid;
          }else{
            if(arr[mid] < val){
              return bisearch(arr,mid+1,high,val);
            } else{
              return bisearch(arr,low,mid-1,val);
            }
          }
        }else{
          return low - 1;
        }
    }

	public static void main(String[] args) {
    	int[] persons = {0,1,1,0,0,1,0};
    	int[] times = {0,5,10,15,20,25,30};
		P911 p = new P911(persons, times);
		System.out.println(p.q(12));
	}
}
