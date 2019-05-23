package leetcode;

import java.util.*;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-14 10:36
 * @Description:
 */
public class P987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        travel(root, visited, map, 0);
        res.addAll(map.values());
        return res;
    }

    private void travel(TreeNode root, Map<TreeNode, Boolean> visited, Map<Integer, List<Integer>> map, int i) {
        if(root == null){
            return;
        }

        if(!visited.containsKey(root)) {
            if(map.containsKey(i)) {
                map.get(i).add(root.val);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                map.put(i, list);
            }
            visited.put(root, true);
        }
        TreeNode left = root.left;
        int leftLevel = i - 1;
        while (left != null) {
            if (!visited.containsKey(left)) {
                if (map.containsKey(leftLevel)) {
                    map.get(leftLevel).add(left.val);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(left.val);
                    map.put(leftLevel, list);
                }
                visited.put(left, true);
            }
            leftLevel--;
            left = left.left;
        }

        TreeNode right = root.right;
        int rightLevel = i + 1;
        while (right != null) {
            if (!visited.containsKey(right)) {
                if (map.containsKey(rightLevel)) {
                    map.get(rightLevel).add(right.val);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(right.val);
                    map.put(rightLevel, list);
                }
                visited.put(right, true);
            }
            rightLevel++;
            right = right.right;
        }

        left = root.left;
        leftLevel = i - 1;
        while (left != null) {
            travel(left, visited, map, leftLevel);
            leftLevel--;
            left = left.left;
        }

        right = root.right;
        rightLevel = i + 1;
        while (right != null) {
            travel(right, visited, map, rightLevel);
            rightLevel++;
            right = right.right;
        }
    }
}
