class Solution {
    public int thirdMax(int[] nums) {
        
        TreeSet<Integer>  sorted = new TreeSet<Integer>();
        
        for(int x : nums){
            
            sorted.add(x);
            
            
            
        }
        
        
        if(sorted.size()>=3){
        sorted.pollLast();
        sorted.pollLast();
            
       
        }
        
        return sorted.last();
    }
}