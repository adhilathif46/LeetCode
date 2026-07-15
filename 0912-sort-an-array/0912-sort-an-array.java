import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        Arrays.sort(nums);
        return nums;
        
    }
}