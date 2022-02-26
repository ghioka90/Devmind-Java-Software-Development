package Curs14;

import java.util.ArrayList;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        ArrayList<Integer> incSubsequence = new ArrayList<>(0);
        ArrayList<Integer>  subsequence = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1] ){
                subsequence.add(nums[i]);
                System.out.println(subsequence);
            }else{
                if(subsequence.size() > incSubsequence.size()){
                incSubsequence = subsequence;
                subsequence.clear();
                }
                continue;
            }
        }
        return incSubsequence.size();
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,4,7};

        

    }
}
