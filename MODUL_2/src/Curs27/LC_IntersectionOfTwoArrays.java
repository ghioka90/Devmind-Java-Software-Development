package Curs27;

import java.util.ArrayList;
import java.util.HashSet;

public class LC_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        ArrayList<Integer> interArray = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++){
            if(!hSet.contains(nums1[i]))
                hSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            if(hSet.contains(nums2[i])){
                interArray.add(nums2[i]);
                hSet.remove(nums2[i]);
            }
        }
        int [] inter = new int[interArray.size()];
        for (int i = 0; i < inter.length; i++){
            inter[i] = interArray.get(i);
        }
        return inter;
    }
    public static void main(String[] args) {
    }
}
