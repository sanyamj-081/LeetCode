class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j < s.length() && s.charAt(j) == t.charAt(i))
                j++;
            
        }   
        System.out.println(j);
        if(j == s.length())
            return true;
        
        return false;
    }
}