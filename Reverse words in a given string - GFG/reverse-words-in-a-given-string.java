//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String str = "";
        String temp ="";
        for(int i=S.length()-1;i>=0;i--) {
            if(S.charAt(i) == '.') 
                {
                    temp += S.charAt(i);
                    str+= temp;
                    temp ="";
                }
            else {
                temp = S.charAt(i) +temp;
            }
            
        }
        return str +temp;
        
    }
}