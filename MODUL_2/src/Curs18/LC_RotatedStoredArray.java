package Curs18;

public class LC_RotatedStoredArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int middle =  (left + right)/2;
            if (target == nums[middle]){
                return middle;
                // break;
            }else if (target < nums[middle]){
                right = middle - 1;
            }else if (target > nums[middle]){
                left = middle + 1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
