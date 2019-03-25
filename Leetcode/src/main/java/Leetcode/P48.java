package medium;

public class P48 {
    public static void rotate(int[][] matrix) {
        rotateHelper(matrix, 0, 0, matrix.length);
    }

	private static void rotateHelper(int[][] matrix, int i, int j, int size) {
		if(size <= 1)
			return;
		//交换外面一层
		int[] nums = new int[4*size-4];
		int count = 0;
		for(int k = j; k < j + size; k++) {
			nums[count++] = matrix[i][k];
		}
		for(int k = i + 1; k <= i + size - 1; k++) {
			nums[count++] = matrix[k][j+size-1];
		}
		for(int k = j + size - 2; k >= j; k--) {
			nums[count++] = matrix[i+size-1][k];
		}
		for(int k = i + size - 2; k >= i+1; k--) {
			nums[count++] = matrix[k][j];
		}
		//交换
		count=0;
		for(int k = i; k < i +size; k++)
			matrix[k][j+size-1] = nums[count++];
		for(int k = j+size-2; k >=j; k--)
			matrix[i+size-1][k] = nums[count++];
		for(int k = i + size - 2; k >=i+1; k--)
			matrix[k][j] = nums[count++];
		for(int k = i; k < i +size-1; k++)
			matrix[i][k] = nums[count++];
		rotateHelper(matrix, i+1, j+1, size-2);
	}

	private static void print(int[] nums) {
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix);
		System.out.println("................");
		print(matrix);
	}

	private static void print(int[][] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++)
				System.out.print(nums[i][j]+" ");
			System.out.println();
		}
			
		
	}
}
