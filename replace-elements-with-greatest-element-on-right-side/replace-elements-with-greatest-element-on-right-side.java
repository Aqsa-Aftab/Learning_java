class Solution {
    public int[] replaceElements(int[] arr) {
        
  
	int len  = arr.length-1;	
int largestElement = 0;
        
        for(int i = 0; i< arr.length-1 ; i++){
            for(int j = i+1; j < arr.length ;j++){
                
                if( largestElement < arr[j]){
                    
                    largestElement = arr[j];
                    
                }
                
                
                
                
            }
            
            arr[i] = largestElement;
            largestElement = 0;
            
        }
        
        arr[len] = -1;
        
        return arr;
        
    }
}