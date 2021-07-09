class Solution {
    public int firstUniqChar(String s) {
        
  
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        
        for(int i = 0; i < s.length(); i++){
            
            char x = s.charAt(i);
            
            if(map.containsKey(x)){
                
                map.put(x , map.get(x)+ 1);
                
            }
            else
            {
                
                map.put(x, 1);
                
            }
            
            
            
            
            
        }
        
        
        int index = -1;
        for(int y = 0; y< s.length(); y++){
                
                if(map.get(s.charAt(y)) == 1)
                {
                 index = y;
                
                    break;
                    
                }
            }
            
        
        
            return index;
            
        
    }
}