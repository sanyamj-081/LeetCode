class Solution {
    public int strStr(String haystack, String needle) {
        int ind =0;
        
        for(int i=0;i<haystack.length() - needle.length() + 1;i++) {
            

            if(haystack.charAt(i) == needle.charAt(0)) {
                System.out.println(haystack.charAt(i));
             System.out.println(needle.charAt(0));
                
                ind = i;
                int j=0;
               // System.out.println(ind);
                while(j<needle.length()) {
                    
                    if(haystack.charAt(i+j) == needle.charAt(j)) {
                        j++;
                        continue;
                    }
                    else {
                       
                        break;
                    }
                    
                    
                }
       
                
            
            if (j == needle.length()) {
                    return ind;
            }
            }
        }
    
    return -1;
    }
}