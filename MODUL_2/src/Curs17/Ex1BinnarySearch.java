package Curs17;

public class Ex1BinnarySearch {


    public static int binarySearchI(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = 0;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == nums[middle]) {
                result = middle;
                break;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            }
        }
        System.out.println("left " + left);
        System.out.println("right " + right);
        System.out.println("result " + result);

        if (result > -1 && result !=0 ) {
            return result;
        } else {
            return left;

        }
    }
    public static void main(String[] args) {
//                         0 1 2 3 4 5  6  7  8  9  10 11 12 13
        int [] intArray = {1,3,4,5,9,10,18,20,23,24,27,29,35,36};
        int key = 2;

        System.out.println("Index of " + key + " is " + binarySearchI(intArray,key));

    }
}
