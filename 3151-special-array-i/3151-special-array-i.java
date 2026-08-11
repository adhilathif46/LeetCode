class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int left=0;
        int right=1;
        for(int i=0;i<=nums.length-2;i++){
            if(!((nums[left]%2==0 && nums[right]%2!=0 || (nums[left]%2!=0 && nums[right]%2==0)))){
                return false;
            }
            left++;
            right++;
        }
        return true;
    }
}