class Solution {
    public void moveZeroes(int[] nums) {
        
       int i = 0, k = 0;
     
        
       
      
        while(i<nums.length){
            
            if(nums[i] != 0){
                
                nums[k] = nums[i];
               
                k++;
            }
            i++;   
            
        }
        
        while(k<nums.length){
            
            nums[k] = 0;
            k++;
        }
        
    }
}