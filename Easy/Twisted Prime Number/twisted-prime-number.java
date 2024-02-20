//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        // code here
        if(N ==1)
        return 0;
        
        if(N <=3) return 1;
        
        int s =1, r = 0, dig =0;
        
        for(int i=2;i<= Math.sqrt(N);i++) {
            if(N%i == 0)
            return 0;
            
        }
        
        while(N>0) {
            r = N%10;
            N = N/10;
            dig = dig*10+r;
        }
        //System.out.println(dig);
        
        
           for(int i=2;i<= Math.sqrt(dig);i++) {
            if(dig%i == 0)
                return 0;
            
         
        }
        return 1;
    }
}