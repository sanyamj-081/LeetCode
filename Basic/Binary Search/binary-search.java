//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    int binarysearch(int arr[], int k, int n) {
        // code here
        int l=0,h=arr.length-1;
        
       
        while(h-l >1){
             int mid=(l+h)/2;
            if(arr[mid]<n)
                l=mid+1;
            else 
                h=mid;
        }    
            if(arr[l]==n)
            {
                return l;
               
            }
            else if(arr[h]==n)
            {
                return h;
                
            }
            else 
            return -1;
    }
}