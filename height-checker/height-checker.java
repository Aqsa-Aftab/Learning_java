class Solution {
    public int heightChecker(int[] heights) {
        
        
        int[] sortedArray = new int[heights.length];
        
        sortedArray = heights.clone();
           
        Arrays.sort(sortedArray);
       int count = 0;
        
        for(int i = 0; i<heights.length ; i++){
            
            if(sortedArray[i] != heights[i])
            {
                count++;
            }
            
        }
        
        return count;
        
    }
}