package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P797 {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        //curr.add(0);
        allPathsSourceTargetHelper(graph, curr, 0, res);
        
        return res;
    }

	private static void allPathsSourceTargetHelper(int[][] graph, List<Integer> curr, int i,
			List<List<Integer>> res) {
		curr.add(i);
		for(Integer n : graph[i]) {
			if(n == graph.length - 1) {
				curr.add(n);
				res.add(new ArrayList<>(curr));
			} else {
				allPathsSourceTargetHelper(graph, curr, n , res);
				
			}	
			curr.remove(curr.size() - 1);
		}
		
	}
	
	public static void main(String[] args) {
		int graph[][] = {{1,2}, {3}, {3},{}};
		System.out.println(allPathsSourceTarget(graph));
	}
}
