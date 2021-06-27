class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[2*n];
        
        int j = n, k = 0;
        for(int i = 0; j< nums.length; i++,j++){
            
            result[k]= nums[i];
            k++;
            result[k] = nums[j];
            k++;
            
        }
        
        return result;
    }
}