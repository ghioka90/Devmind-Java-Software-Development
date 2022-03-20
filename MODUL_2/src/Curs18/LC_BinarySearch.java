package Curs18;

public class LC_BinarySearch {
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
        int[] nums = {1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
}
