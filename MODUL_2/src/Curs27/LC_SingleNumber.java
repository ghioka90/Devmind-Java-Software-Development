package Curs27;

import P2_ImparteSurprize.FortuneCookie;

import java.util.HashSet;

public class LC_SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hSet = new HashSet<Integer>();

        for( int i = 0; i < nums.length; i++){
            if (!hSet.contains(nums[i])){
                hSet.add(nums[i]);
            }else
                hSet.remove(nums[i]);
        }
        for(int i:hSet)
        {
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
