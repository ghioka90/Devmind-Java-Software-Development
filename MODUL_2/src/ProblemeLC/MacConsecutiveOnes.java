package ProblemeLC;

public class MacConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int consDigits = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
            }else if(count > consDigits){
                consDigits = count;
                count = 0;
            }
            consDigits = count;
        }
        return consDigits;
    }
    public static void main(String[] args) {
        int[] B = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(B));
    }
}
