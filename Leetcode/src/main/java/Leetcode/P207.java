package medium;

public class P207 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        //��������
    	 	
    	//����ÿ��������
    	int[] vec = new int[numCourses];
		for(int j = 0; j < prerequisites.length; j++) {
			vec[prerequisites[j][1]]++;
		}	

		//�ֱ��¼�ߺ͵��Ƿ�ɾ��
		boolean[] deleteEdges = new boolean[prerequisites.length];
		boolean[] deleteDots = new boolean[numCourses];
		
		//���ҵ�û��ɾ���ĵ� �����Ϊ0
		int i = -1;
		i = hasNextDot(vec, deleteDots);
		while(i != -1) {
			for(int j = 0; j < prerequisites.length; j++) {
				if(!deleteEdges[j] && prerequisites[j][0] == i) {
					vec[prerequisites[j][1]]--;
					deleteEdges[j] = true;
				}
			}
			deleteDots[i] = true;
			i = hasNextDot(vec, deleteDots);
		}
		
		for(int l = 0; l < vec.length; l++) {
			if(vec[l] != 0)
				return false;
		}
		return true;
    }

	private static int hasNextDot(int[] vec, boolean[] deleteDots) {
		for(int i = 0; i < vec.length; i++) {
			if(!deleteDots[i] && vec[i] == 0)
				return i;
		}
		return -1;
	}

	
}
