package easy;

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};

public class P427 {
	
    public Node construct(int[][] grid) {     	
    	return constructTree(grid, 0, 0, grid.length);
    }
    
    public Node constructTree(int[][] grid, int startX, int startY, int length) {
    	Node root = null;
    	if(length == 1) {
    		root = new Node(); 
    		root.isLeaf = true;
    		root.val = grid[startX][startY] == 1;
    	}
    	else {
    		root = new Node(); 
    		root.isLeaf = true;
    		for(int i = startX; i < startX + length; i++) {
    			for(int j = startY; j < startY + length; j++) {
    				if(grid[i][j] != grid[startX][startY]) {
    					root.isLeaf = false;
    					break;
    				}
    			}
    		}
    		if(root.isLeaf) {
    			root.val = grid[startX][startY] == 1;
    		} else {
    			root.topLeft = constructTree(grid, startX, startY, length / 2);
    			root.topRight = constructTree(grid, startX, startY  + length / 2, length / 2);
    			root.bottomLeft = constructTree(grid, startX + length / 2, startY, length / 2);
    			root.bottomRight = constructTree(grid, startX + length / 2, startY  + length / 2, length / 2);
    		}
    	}
		return root;
    }

}
