class Solution {
    public boolean validMountainArray(int[] arr) {
        
        
        int len = arr.length-1;
        int k = 0,i=0;
        
        if(arr.length<3){
                return false;
            
        }
        else{
            
            while(i<len){
                
                if(arr[i] < arr[i+1]){
                    i++;
                }
                else
                {
                   
                    break;
                }
                
                
            }
            
            if(i == len){
                return false;
            }
            else if(i== 0){
                return false;
                
            }
            
            while( i < len){
                
                if(arr[i]> arr[i+1]){
                    i++;
                }
                else
                {
                    return false;
                }
            }
            
            
            
        }
        
        
        
        
        
        return true;
    }
}