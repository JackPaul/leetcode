package utils;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-03-30 9:47
 * @Description:
 */
public class Sort {
    //插入排序

    //冒泡排序

    //希尔排序

    //归并排序

    //快速排序
    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int center = (start + end) / 2;
        int p = centerOfThree(nums, start, center, end);

        //交换枢纽和首元素 便于计算
        int c = nums[p];
        nums[p] = nums[start];
        nums[start] = c;

        int i = start + 1;
        int j = end;
        while (i < j) {
            while (i < j && nums[j] >= nums[start]) {
                j--;
            }
            while (i < j && nums[i] <= nums[start]) {
                i++;
            }

            if (i < j) {
                c = nums[i];
                nums[i] = nums[j];
                nums[j] = c;
            }
        }
        c = nums[i];
        nums[i] = nums[start];
        nums[start] = c;
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);

    }

    //三中值法
    private int centerOfThree(int[] nums, int i, int j, int k) {
        if (nums[i] >= nums[j] && nums[j] >= nums[k])
            return j;
        if (nums[i] >= nums[k] && nums[k] >= nums[j])
            return k;
        if (nums[j] >= nums[i] && nums[i] >= nums[k])
            return i;
        if (nums[j] >= nums[k] && nums[k] >= nums[i])
            return k;
        if (nums[k] >= nums[i] && nums[i] >= nums[j])
            return i;
        if (nums[k] >= nums[j] && nums[j] >= nums[i])
            return j;
        return i;
    }
    //基数排序

    //堆排序


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 5, 2, 4, 5};
        new Sort().quickSort(nums, 0, nums.length - 1);
    }
}
