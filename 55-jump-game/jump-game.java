class Solution {
    public boolean canJump(int[] nums) {
        int lastPost= nums.length-1;
        for (int i=nums.length-2; i>=0; i--){
            if (i+nums[i]>=lastPost){
                lastPost=i;
            }
        }
        return lastPost==0;
    }
}