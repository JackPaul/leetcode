package leetcode;

import java.util.*;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:35
 * @Description:
 */
public class P236 {
    /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.push(root);
        TreeNode res = null;
        while(!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            if(isAncestor(node, p) && isAncestor(node, q)){
                res = node;
            }
            if(node.right != null) {
                nodes.push(node.right);
            }
            if(node.left != null) {
                nodes.push(node.left);
            }
        }
        return res;
    }

    private boolean isAncestor(TreeNode node1, TreeNode node2) {
        if(node1 == node2) {
            return true;
        }
        if(node1 == null) {
            return false;
        }
        return isAncestor(node1.left, node2) || isAncestor(node1.right, node2);
    }
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }

        Map<TreeNode, TreeNode> parents = new HashMap<>();
        //建立从子节点指向父亲节点的map
        constructRelations(root, parents);
        List<TreeNode> path_P = new ArrayList<>();
        List<TreeNode> path_Q = new ArrayList<>();
        TreeNode currentNode = p;
        while (currentNode != null && parents.containsKey(currentNode)){
            path_P.add(currentNode);
            if(currentNode == q) {
                return q;
            }
            currentNode = parents.get(currentNode);
        }
        currentNode = q;
        while (currentNode != null && parents.containsKey(currentNode)){
            path_Q.add(currentNode);
            if(currentNode == p) {
                return p;
            }
            currentNode = parents.get(currentNode);
        }
        TreeNode res = null;
        for(TreeNode node:path_P) {
            if(path_Q.lastIndexOf(node) != -1) {
                res = node;
                break;
            }

        }
        if(res == null)
            return root;
        return res;
    }

    private void constructRelations(TreeNode root, Map<TreeNode, TreeNode> parents) {
        if(root != null) {
            if(root.right != null) {
                parents.put(root.right, root);
                constructRelations(root.right,parents);
            }
            if(root.left != null) {
                parents.put(root.left, root);
                constructRelations(root.left, parents);
            }
        }
    }

}
