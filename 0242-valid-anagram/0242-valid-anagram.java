class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int arr[] = new int[26];
        int ar[] = new int[26];
        
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i)- 'a']++;
            
        }
        for(int i=0;i<t.length();i++) {
            ar[t.charAt(i) - 'a']++;
            
        }
        for(int i=0;i<s.length();i++) {
            if(arr[s.charAt(i)- 'a']!= ar[s.charAt(i) - 'a'])
                return false;
        }
    return true;
    }
}