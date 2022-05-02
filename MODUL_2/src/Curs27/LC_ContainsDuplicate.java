package Curs27;

import java.util.HashSet;

public class LC_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        boolean result = false;
        for (int i = 0; i < nums.length; i++){
            if (!hashSet.add(nums[i]))
                result = true;
        }
        return result;
    }
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(1);

        System.out.println(hashSet);
    }
}
