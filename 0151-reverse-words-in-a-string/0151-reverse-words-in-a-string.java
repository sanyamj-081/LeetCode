class Solution {
    public String reverseWords(String st) {
        String s= st.trim();
        // System.out.println(s.trim());
        StringBuilder str = new StringBuilder();
        StringBuilder res= new StringBuilder();
        
        for(int i = s.length()-1; i>=0; i--) {
            
            if(s.charAt(i) == ' '){
                res.append(str.reverse());
                str = new StringBuilder();
                if(s.charAt(i+1) != ' ')
                res.append(' ') ;
            }
            else
            str.append(s.charAt(i));
        }
        res.append(str.reverse());
        
        return res.toString();
    }
}