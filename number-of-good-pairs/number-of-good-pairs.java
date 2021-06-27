import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        
     int goodValue = 0;
	int noValue = 0;
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int x : nums)
	{
		if(!map.containsKey(x)) {
			
			map.put(x, 1);
		}
		else
		{
			map.put(x, map.get(x)+1);
			
		}
		
	}
        
        Set<Integer> keys = map.keySet();
        
        for(int key : keys) {
		
		if(map.get(key)!=1) {
			
			noValue = map.get(key);
			
			goodValue = goodValue + (noValue * (noValue-1)/2);
			
			
		}
		
		
	}
        
        return goodValue;
        
        
        
    }
}