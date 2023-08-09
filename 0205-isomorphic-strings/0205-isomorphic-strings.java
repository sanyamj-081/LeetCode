class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
             return false;
        
        HashMap<Character, Integer> ss = new HashMap<>();
        HashMap<Character, Integer> tt = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            if(!ss.containsKey(s.charAt(i)))
                ss.put(s.charAt(i),i); 
        }
        for(int i=0;i<t.length();i++) {
            if(!tt.containsKey(t.charAt(i)))
                tt.put(t.charAt(i),i);
        }
        for(int i=0;i<s.length();i++) {
            if(ss.get(s.charAt(i)) != tt.get(t.charAt(i)))
                return false;
                
        }
        return true;
        
        
    }
}