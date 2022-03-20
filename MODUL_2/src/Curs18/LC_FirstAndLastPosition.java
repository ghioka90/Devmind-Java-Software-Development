package Curs18;

import java.util.Arrays;

public class LC_FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        if(nums == null || nums.length == 0) {
            return result;
        }

        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);

        return result;
    }

    private static int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left + 1 < right) {
            int mid = left + (right - left)/2;
            if(nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if(nums[left] == target) {
            return left;
        } else if(nums[right] == target) {
            return right;
        }

        return -1;
    }

    private static int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left + 1 < right) {
            int mid = left + (right - left)/2;
            if(nums[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if(nums[right] == target) {
            return right;
        } else if(nums[left] == target) {
            return left;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }
}
