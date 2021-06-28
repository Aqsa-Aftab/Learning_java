class Solution {
    public boolean checkIfExist(int[] arr) {
        
        
       Map<Double, Integer> map = new HashMap<Double,Integer>();
		
		for(double x : arr) {
			
			if(map.containsKey(2* x) || map.containsKey(x/2)) {
				
				return true;
				
			}
			else {
				
				map.put(x, 1);
				
			}
			
			
		}
        
        return false;
        
    }
}