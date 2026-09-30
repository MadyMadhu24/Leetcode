class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        for (int j=0; j<nums.length; j++){
            if (nums[j]<min){
                min=nums[j];
            }
        }
        return(GCD(max,min));
    }
    static int GCD(int max, int min){
        if (min==0){
            return max;
        }
        return GCD(min, max % min);
    }
}