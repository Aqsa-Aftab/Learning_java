class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum =0;
        int j =0;
        int[] runningSum = new int[nums.length];
        for(int i : nums){
            
            sum = sum + i;
            runningSum[j] = sum;
            j++;
        }
        
        return runningSum;
    }
}