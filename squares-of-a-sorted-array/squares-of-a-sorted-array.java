

class Solution {
   public int[] sortedSquares(int[] nums) {
       
       int length = nums.length;
       int[] squares = new int[length];
       int last = nums.length-1;
       int j = nums.length-1;
       for(int i = 0; i<=last;){
           
           if(nums[i] * nums[i]>= nums[last] * nums[last] )
           {
               squares[j] = nums[i] * nums[i];
               j--;
               i++;
           }
           else{
               squares[j] = nums[last] * nums[last];
               
               last--;
               j--;
           }
           
           
       }
       return squares;
       
       
       
   }
   
    }
