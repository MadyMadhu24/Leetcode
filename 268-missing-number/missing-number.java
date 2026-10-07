class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int arraySum=0;
        for (int ele: nums){
            arraySum += ele;
        }
        return (int)(sum-arraySum);
    }
}