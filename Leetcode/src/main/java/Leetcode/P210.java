package medium;

public class P210 {

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int idx = 0;
        int[] res = new int[numCourses];
        
        //计算每个点的入度
        int[] inVec = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
        	inVec[prerequisites[i][0]]++;
        }
        //删除入度为0的点
        int p = hasZeroInVec(inVec);
        while(idx < numCourses && p != -1) {
        	//删除p点 更新InVec
            for(int i = 0; i < prerequisites.length; i++) {
            	if(prerequisites[i][1] == p) {
            		inVec[prerequisites[i][0]]--;
            	}
            	
            }
        	res[idx++] = p;
        	inVec[p] = -1;
        	p = hasZeroInVec(inVec);
        }
        
        
        if(idx == numCourses) {
        	return res;
        }
        return new int[0];
    }

	private static int hasZeroInVec(int[] inVec) {
		for(int i = 0; i < inVec.length; i++) {
			if(inVec[i] == 0)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		System.out.println(findOrder(numCourses, prerequisites));
	}
}
